#!/usr/bin/env node
const fs = require("fs");
const path = require("path");
const OUT_DIR = __dirname;
const OUTPUT = process.argv[2] || path.join(OUT_DIR, "..", "cli.rebuilt.js");
const manifest = JSON.parse(fs.readFileSync(path.join(OUT_DIR, "_manifest.json"), "utf-8"));
manifest.sort((a, b) => a.index - b.index);
let result = "";
for (const entry of manifest) {
  let content = fs.readFileSync(path.join(OUT_DIR, entry.filename), "utf-8");
  if (!content.endsWith("\n")) content += "\n";
  result += content;
}
fs.writeFileSync(OUTPUT, result, "utf-8");
console.log("Rebuilt:", OUTPUT, (result.length / 1024 / 1024).toFixed(1), "MB", result.split("\n").length, "lines");
