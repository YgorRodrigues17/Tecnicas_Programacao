var counterVal = 0;

function incrementClick() {
updateDisplay(++counterVal);
}

function resetCounter() {
counterVal = 0;
updateDisplay(counterVal);
}

function updateDisplay(val) {
document.getElementById("counter-label").innerHTML = val;
}

var counterVal2 = 0;

function incrementClick2() {
updateDisplay2(++counterVal2);
}

function resetCounter2() {
counterVal2 = 0;
updateDisplay2(counterVal2);
}

function updateDisplay2(val2) {
document.getElementById("counter-label2").innerHTML = val2;
}

var counterVal3 = 0;

function incrementClick3() {
updateDisplay3(++counterVal3);
}

function resetCounter3() {
counterVal3 = 0;
updateDisplay3(counterVal3);
}

function updateDisplay3(val3) {
document.getElementById("counter-label3").innerHTML = val3;
}

var comentarios, index;

    function adicionarComentario(comentario){
        comentarios = document.getElementById("tbComentarios");
        var qtdLinha = comentarios.rows.lenght;
        var linha = comentarios.insertRow(qtdLinha);
        var linhaParam;

        var cellComentario = linha.insertCell(0);

        cellComentario.innerHTML = comentario;

        preencherLinha();
    }

    function altComentario(comentario){
        comentarios.rows[index].cells[0].innerHTML = comentario
    }

    function preencherLinha(){
        for(var i = 0; i < comentarios.rows.lenght; i++){
            comentarios.rows[i].onclick = function(){
                index = this.rowIndex;
                document.getElementById("txtComentario").value = comentarios.rows[index].cells[0].innerText;
            }
        }
    }

    var comentarios2, index2;

    function adicionarComentario2(comentario2){
        comentarios2 = document.getElementById("tbComentarios2");
        var qtdLinha2 = comentarios2.rows.lenght;
        var linha2 = comentarios2.insertRow(qtdLinha2);
        var linhaParam2;

        var cellComentario2 = linha2.insertCell(0);

        cellComentario2.innerHTML = comentario2;

        preencherLinha2();
    }

    function altComentario2(comentario2){
        comentarios2.rows[index2].cells[0].innerHTML = comentario2
    }

    function preencherLinha2(){
        for(var i = 0; i < comentarios2.rows.lenght; i++){
            comentarios2.rows[i].onclick = function(){
                index2 = this.rowIndex2;
                document.getElementById("txtComentario2").value = comentarios2.rows[index2].cells[0].innerText;
            }
        }
    }

    var comentarios3, index3;

    function adicionarComentario3(comentario3){
        comentarios3 = document.getElementById("tbComentarios3");
        var qtdLinha3 = comentarios3.rows.lenght;
        var qtdLinha3 = comentarios3.insertRow(qtdLinha3);
        var linhaParam3;

        var cellComentario3 = linha3.insertCell(0);

        cellComentario3.innerHTML = comentario3;

        preencherLinha3();
    }

    function altComentario3(comentario3){
        comentarios3.rows[index3].cells[0].innerHTML = comentario3
    }

    function preencherLinha3(){
        for(var i = 0; i < comentarios3.rows.lenght; i++){
            comentarios3.rows[i].onclick = function(){
                index3 = this.rowIndex3;
                document.getElementById("txtComentario3").value = comentarios3.rows[index3].cells[0].innerText;
            }
        }
    }