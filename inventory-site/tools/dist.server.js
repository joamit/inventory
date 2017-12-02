import express from 'express';
import path from 'path';
import open from 'open';
import compression from 'compression';

/*eslint-disable no-console*/

const port = 3000;
const app = express();

app.use(compression());
app.use(express.static('dist'));

app.get('*', (req, res) => {
    res.sendFile(path.join(__dirname, '../dist/index.html'));
});

app.listen(port, (err) => {
    if (err) {
        console.log(err.bold.red);
    }
    else {
        open(`http://localhost:${port}`);
    }
});