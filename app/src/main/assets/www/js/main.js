function scoreRuns(runs) {

    var score = Number(document.getElementById("score").innerHTML);
    score = score + runs;
    document.getElementById("score").innerHTML = score;
}