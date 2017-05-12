var width = 500;
var height = 500;
var padding = 4;
var pointRadius = 4;
var numberOfPoints = 20;
var points = [];
var sortedPoints = [];
var lowestPoint;
var svg = d3.select(".convex-hull-container").append("svg").attr("width", width).attr("height", height);


function init() {
	generatePoints();
	addPointClass(lowestPoint, 'lowest-point');
	orderPointsByPolarAngle(lowestPoint);
}

function generatePoints() {
	for (var i = 0; i < numberOfPoints; i++) {
		var x = Math.round(Math.random() * (width - 2 * padding) + padding);
		var y = Math.round(Math.random() * (height - 2 * padding) + padding);
		var point = {
			x: x,
			y: y,
			circle: drawPoint(x, y)
		};
		points[i] = point;
		maybeUpdateLowestPoint(point);
	}
}

function drawPoint(x, y) {
	return svg.append("circle")
		.attr("class", "point")
		.attr("r", pointRadius)
		.attr("cx", x)
		.attr("cy", height - y); // y because y is flipped!
}

function addPointClass(point, className) {
	point.circle.attr("class", className);
}

/* If the point passed is lower than the lowest known point, update */
function maybeUpdateLowestPoint(point) {
	if (lowestPoint == null || point.y < lowestPoint.y) {
		lowestPoint = point;
	}
}

/* Draw a line between pointA and pointB */
function drawLine(pointA, pointB) {
}

/* Sort the points array by increasing polar angle from the initial point. */
function orderPointsByPolarAngle(initialPoint) {
	points = insertionSort(points, polarLess);
	for (var i = 0; i < numberOfPoints; i++) {
		var angle = polarAngle(initialPoint, points[i]);
		console.log(angle);
	}
}

/* Determine the polar angle between pointA and pointB */
function polarAngle(pointA, pointB) {
	// TODO: Need to account for knowing which quadrant the points are in, 
	// otherwise you get negative numbers
	var x = pointA.x - pointB.x;
	var y = pointA.y - pointB.y;
	if (x == 0 && y == 0) {
		return 0;
	}
	if (x == 0) {
		return y > 0 ? 90 : 270;
	}
	return Math.atan(y.toFixed(1) / x.toFixed(1)) * 180 / Math.PI;
}

/* Determine if the rotation (A-B -> B-C) is positive */
function isPositivePolarRotation(pointA, pointB, pointC) {
}

/* Implementation of insertion sort using polarLess as the comparator */
function insertionSort(a, lessFn) {
    for (var i = 0; i < numberOfPoints; i++) {
        for (var j = i; j > 0; j--) {
            if (lessFn(a[j], a[j-1])) {
                swap(a, j, j-1);
            } else {
                break;
            }
        }
    }
    return a;
}

/* Determine if the polar angle between A and the control point is less
 * than the polar angle between B and the control point.
 */
function polarLess(pointA, pointB) {
	return polarAngle(lowestPoint, pointA) < polarAngle(lowestPoint, pointB);
}

/* Swap element i with element j in array a */
function swap(a, i, j) {
	tmp = a[i];
	a[i] = a[j];
	a[j] = tmp;
}

init();