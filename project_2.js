function ThreeDimensionalPoint (x,y,z) { // Function to create 3D points
    // Setting the point values based on passed over parameters
    this.x = x; 
    this.y = y;
    this.z = z;
    this.calcDistance = function (otherPoint) { // A function to calcuate the distance between the point and a point passed over
        let distance = Math.sqrt(Math.pow((x - otherPoint.x),2) + Math.pow((y - otherPoint.y),2) + Math.pow((z - otherPoint.z),2)); // Formula for distance between two points
        return distance; // Returning that distance
    };
}

 // Creating first and second object to hold points
let p1 = new ThreeDimensionalPoint(3,4,5);
let p2 = new ThreeDimensionalPoint(6,7,8);

// Calculating the distance between the two (they should be the same value if the code works)
console.log(p1.calcDistance(p2));
console.log(p2.calcDistance(p1));
