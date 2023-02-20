// the fs module to interact with the filesystem and .promises part for writing async code.
import { promises as fs } from "fs";

// reading a file
async function readFile(filePath) {
  try {
    const data = await fs.readFile(filePath);
    console.log(data.toString());
  } catch (error) {
    console.error(`Got an error trying to read the file: ${error.message}`);
  }
}

readFile("resource\\greetings.txt");

// creating/writing a file
async function createFile(filePath) {
  try {
    const csvHeaders = "name,quantity,price";
    await fs.writeFile(filePath, csvHeaders);
  } catch (error) {
    console.error(`Got an error trying to read the file: ${error.message}`);
  }
}

async function writeToFile(filePath, name, quantity, price) {
  try {
    const csvData = `\n${name},${quantity},${price}`;
    await fs.writeFile(filePath, csvData, { flag: "a" }); // flag - a (for appending)
  } catch (error) {
    console.error(`Got an error trying to read the file: ${error.message}`);
  }
}

(async function () {
  await createFile("resource\\items.csv");
  await writeToFile("resource\\items.csv", "eggs", 12, 1.5);
  await writeToFile("resource\\items.csv", "nutella", 1, 4);
})();

// deleting a file
async function deleteFile(filePath) {
  try {
    await fs.unlink(filePath); // When you delete the file with the unlink() function, it is not sent to your recycle bin or trash can but permanently removed from your filesystem.
    console.log(`Deleted ${filePath}`);
  } catch (error) {
    console.error(`Got an error trying to delete the file: ${error.message}`);
  }
}

deleteFile("resource\\items.csv");

// renaming and moving a file
async function moveFile(source, destination) {
  try {
    await fs.rename(source, destination);
    console.log(`Moved file from ${source} to ${destination}`);
  } catch (error) {
    console.error(`Got an error trying to move the file: ${error.message}`);
  }
}

moveFile("greetings-2.txt", "test-data/salutations.txt");
