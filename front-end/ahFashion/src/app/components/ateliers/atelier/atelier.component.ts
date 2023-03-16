import { Component } from '@angular/core';

@Component({
  selector: 'app-atelier',
  templateUrl: './atelier.component.html',
  styleUrls: ['./atelier.component.css']
})
export class AtelierComponent {
listeatelier = [
  {
    atelierName : " Chez NZO",
    imgUrl : "https://gap.boutic-app.fr/photos/fd66be9d9ee3f8f20511688db3ba5261.jpg"
  },
  {
    atelierName : " Pret a porter Couture",
    imgUrl : "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRq1G95CYCYw5wtYRcBMlMKrg3DzAmX7jVxxHuWiwD_i5QOyoVHEg6xFh1FWjjrFBuc0vY&usqp=CAU.jpg"
  },
  {
    atelierName : " La Temple de la Sape",
    imgUrl : "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3LSz-sDbyRNWuAipi81_VA5DvLL2zMe8aRO6XfFX-aAFg27xbW6ih_Oz_rRPQCPUz6yw&usqp=CAU.jpg"
  },
  {
    atelierName : " Shaoline Style",
    imgUrl : "https://www.petitcitron.com/blog/wp-content/uploads/2015/07/atelier-optimisation.jpg"
  },
  {
    atelierName : "Bams&Frere Couture",
    imgUrl : "https://bizibul.fr/wp-content/uploads/2016/01/RANGEMENT_TISSU_2.jpg"
  },
  {
    atelierName : " Le Couturier Bingiste",
    imgUrl : "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRq1G95CYCYw5wtYRcBMlMKrg3DzAmX7jVxxHuWiwD_i5QOyoVHEg6xFh1FWjjrFBuc0vY&usqp=CAU.jpg"
  }
]
}
