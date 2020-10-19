function ThreeDimensionalPoint (x,y,z) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.calcDistance = function (otherPoint) {
        let distance = Math.sqrt(Math.pow((x - otherPoint.x),2) + Math.pow((y - otherPoint.y),2) + Math.pow((z - otherPoint.z),2));
        return distance;
    };
}

let p1 = new ThreeDimensionalPoint(3,4,5);
let p2 = new ThreeDimensionalPoint(6,7,8);

console.log(p1.calcDistance(p2));
console.log(p2.calcDistance(p1));