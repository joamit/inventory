/*eslint-disable no-console*/
import webpack from 'webpack';
import webpackConfig from '../webpack.config.prod';
import colors from 'colors';

process.env.NODE_ENV = 'production';

console.log(colors.blue('Generating minified bundle for production via webpack. This will take a moment....'));

webpack(webpackConfig).run((err, stats) => {
    if (err) {
        console.error(err.bold.red);
        return 1;
    }
    const jsonStats = stats.toJson();

    if (jsonStats.hasErrors) {
        return jsonStats.errors.map(error => console.log(error.red));
    }

    if (jsonStats.hasWarnings) {
        console.log('Webpack generated the following warnings: '.bold.yellow);
        jsonStats.warnings.map(warning => console.log(warning.yellow));
    }

    console.log(`Webpack stats: ${stats}`);

    console.log('The website has been compiled in production mode and written to ../inventory-service/src/main/resources/static/js. It\'s ready to be served!!!!!'.bold.green);

    return 0;
});