
// a function é como se fosse um método em java
//na função setuo difinimos as configurações de largura e altura
function setup() {
    createCanvas(700,400);
}

// na função de desenho definimos o que será exibido
function draw() {
    background(imagemDaEstrada);
    //o primeiro serve do eixo x, o segundo no eixo y, e os outros dois  altura/w e largura/h respectivamente
    //O image permite manipular o objeto no eixo X e Y como também W e H
    movimentoCarro();
    movimentoMascote();
    mostrarCarros(); 
    mostrarMascote();
    incluirPontos();
    varificaColisao();

  
    // Desenha o círculo
 
}
    


