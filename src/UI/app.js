const express = require('express');
const path = require('path');

const app = express();

app.use(express.static(path.join(__dirname, 'public')));
app.set('views', path.join(__dirname, 'views'));
app.engine('html', require('ejs').renderFile);
app.set('view engine', 'html');

app.get('/', (req, res) => {
    res.render('index');
});

// Обработка запроса к странице page1
app.get('/admin', (req, res) => {
    res.render('admin');
});

app.listen(8081, () => {
    console.log('Server is running on http://localhost:8081');
});
