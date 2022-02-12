const { v4: uuidv4 } = require('uuid');
const express = require('express');
const app = express();
const PORT = 8080;
// const cors = require("cors");
// var corsOptions = {
//   origin: "http://localhost:8081"
// };
// app.use(cors(corsOptions));

/* -------------------------------------------------------------------------- */
/*                                Server setup                                */
/* -------------------------------------------------------------------------- */
app.use( express.json() );
app.use(express.urlencoded({ extended: true }));

app.listen(
  PORT,
  () => {
    console.log(`Server start at ${PORT}`);
  }
);

/* -------------------------------------------------------------------------- */
/*                                 Restful API                                */
/* -------------------------------------------------------------------------- */
app.get('/tshirt/:id', (req, res) => {
  const { id } = req.params;

  // TODO: Call repository to retrieve data from database

  // Response data
  res.status(200).send({
    id,
    name: '👔',
    size: 'large',
    color: 'white',
  });
});

app.post('/tshirt', (req, res) => {
  const { size, name, color } = req.body;

  if (!name) {
    return res.status(460).send({
      error: 'Name can not be null',
    });
  }

  // TODO: Save into database, etc...

  // Response data
  res.status(200).send({
    id: uuidv4(),
    size,
    name,
    color,
  });
});

/* -------------------------------------------------------------------------- */
/*                      File upload and download by name                      */
/* -------------------------------------------------------------------------- */
global.__basedir = __dirname;
const controller = require('./file.controller');
const router = express.Router();

router.post('/upload', controller.upload);
router.get("/files/:name", controller.download);

app.use(router);