// main.js

let timerInterval; // setInterval�� �����ϱ� ���� ����
let startTime; // ���� �ð��� �����ϱ� ���� ����
let running = false; // Ÿ�̸Ӱ� ���� ������ ���θ� �����ϴ� ����

// Ÿ�̸� ���� �Լ�
function startTimer() {
    startTime = new Date();
    timerInterval = setInterval(updateTimer, 1000);
    running = true;
}

// Ÿ�̸� ������Ʈ �Լ�
function updateTimer() {
    let currentTime = new Date();
    let elapsedTime = currentTime - startTime;
    let seconds = Math.floor((elapsedTime / 1000) % 60);
    let minutes = Math.floor((elapsedTime / 1000 / 60) % 60);
    let hours = Math.floor((elapsedTime / 1000 / 60 / 60) % 24);

    // 10���� ���� ��� 0�� �߰��Ͽ� �� �ڸ��� ǥ��
    seconds = seconds < 10 ? "0" + seconds : seconds;
    minutes = minutes < 10 ? "0" + minutes : minutes;
    hours = hours < 10 ? "0" + hours : hours;

    // Ÿ�̸� ������Ʈ
    document.getElementById("timer").textContent = hours + ":" + minutes + ":" + seconds;
}

// Ÿ�̸� ���� �Լ�
function stopTimer() {
    clearInterval(timerInterval);
    running = false;
}

// ���� ��ư Ŭ�� �� �̺�Ʈ �ڵ鷯
document.getElementById("startButton").addEventListener("click", function() {
    if (!running) {
        startTimer();
    }
});

// ���� ��ư Ŭ�� �� �̺�Ʈ �ڵ鷯
document.getElementById("stopButton").addEventListener("click", function() {
    if (running) {
        stopTimer();
    }
});