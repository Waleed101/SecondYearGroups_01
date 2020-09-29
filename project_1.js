//create the draw function which either returns a draw rectangle function or draw triangle function
function draw(shape, displacement) {//take two parameters, the shape and the displacement wanted

    let offset = "";//initialize the value of the offset to an empty string
    for (let d = 0; d < displacement; d++) {
        offset += " ";//add a certain number of spaces depending on the displacement wanted
    }
    let drawRectangle = dimensions => {//draw rectangle function, take on object of dimensions
        //assign the length and the width to the object width and length values
        let length = dimensions['length'];
        let width = dimensions['width'];
        let rectangle = "";//assign the rectangle to an empty string

        for (let w = 0; w < width; w++) {//loop through the size of the width variable
            let line = "\n";//at the beginning of iteration create a new line

            line += offset;//line is equal to the offset length
            for (let l = 0; l < length; l++) {
                line += "*";//draw the number of stars length is equal to
            }

            rectangle += line;//add the line value to rectangle
        }
        console.log(rectangle);//display the rectangle
    }



    let drawTriangle = (height) => {//create a draw triangle function that takes one parameter which is the height
        let triangle = "";//assign triangle binding to an empty string

        for (let h = 0; h < height; h++) {//loop through the "height" number of times
            let line = '\n';//at the start of each iteration, create a new line
            line += offset;//offset is added to the line binding
            //for each line, draw one more star relative to the last line
            for (let s = 0; s<h+1; s++){
                line += "*";
            }
            triangle += line;//adding the line will create a right angle triangle
        }
        console.log(triangle);//display the triangle
    }
    //return the drawRectangle function if the original shape paramater is a rectangle, drawTriangle if it is not rectangle
    if(shape === 'rectangle') {
        return drawRectangle;
    } else {
        return drawTriangle;
    }
}

//draw two rectangles with 10 space displacement but different dimensions
const RECTANGLE_1 = draw('rectangle', 10);
RECTANGLE_1({'width': 5, 'length': 8});
RECTANGLE_1({'width': 4, 'length': 6});
//draw two rectangles with 20 space displacement but different dimensions
const RECTANGLE_2= draw('rectangle', 20);
RECTANGLE_2({'width': 7, 'length': 9});
RECTANGLE_2({'width': 3, 'length': 8});
console.log('==============================')//divider between rectangle and triangle
//draw two triangles with 10 space displacement but different height
const TRIANGLE_1 = draw('triangle', 10);
TRIANGLE_1(10);
TRIANGLE_1(8);
//draw two triangles with 20 space displacement but different heights
const TRIANGLE_2 = draw('triangle', 20);
TRIANGLE_2(9);
TRIANGLE_2(11);