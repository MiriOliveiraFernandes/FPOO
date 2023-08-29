let yMascote =  360;
let xMascote = 70;
let meusPontos = 0;
let colisao = false;

function varificaColisao() {
    for (let i = 0; i < imagensCarros.length; i++){
        colisao = collideRectCircle(xCarros[i],yCarros[i],comprimentoCarros,alturaCarros, xMascote+17, yMascote+17,15);

        if (colisao == true) {
            if (meusPontos>0) {
                meusPontos -= 1
                yMascote = 360
            }
            else{
                yMascote = 360
            }

        }

    }
    print('Colisão acontecendo', colisao)
}

function mostrarMascote() {
    image(imagemDoMascote, xMascote,yMascote, 40, 40);
}

function incluirPontos() {
    text(meusPontos,20,25);
    fill(color(255,0,0));
    textSize(21);

    if (yMascote < 20) {
        meusPontos++;
        yMascote = 365;   
    }
    
    
}

function movimentoMascote() {
    if (keyIsDown(UP_ARROW)) {
        yMascote -= 3 ;
    } 

    if (keyIsDown(DOWN_ARROW)) {
        yMascote += 3 ;
    }
    
    if (keyIsDown(LEFT_ARROW)) {
        xMascote -= 3 ;
    }

    if (keyIsDown(RIGHT_ARROW)) {
        xMascote += 3 ;
    }
}
 
