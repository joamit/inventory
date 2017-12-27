import fs from 'fs';
import cheerio from 'cheerio';
import colors from 'colors';

/*eslint-disable no-console*/

fs.readFile('src/index.html', 'utf8', (err, markup) => {
    if (err) {
        return console.log(colors.bold.red(err));
    }

    const $ = cheerio.load(markup, {xmlMode: true});

    fs.writeFile('../inventory-service/src/main/resources/templates/index.html', $.html(), 'utf8', function (err) {
        if (err) {
            return console.log(colors.bold.red(err));
        }
        console.log(colors.bold.green('index.html was successfully written to ../inventory-service/src/main/resources/templates'));
    });
});