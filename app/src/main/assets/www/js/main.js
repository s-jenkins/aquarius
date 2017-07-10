function scoreRuns(runs) {

    var score = 0;
    if (localStorage.getItem('score') && runs > 0) {
        score = Number(localStorage.getItem('score'));
    }
    score = score + runs;
    document.getElementById("score").innerHTML = score;
    localStorage.setItem('score', score);
}