/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemaPractica;

/**
 *
 * @author pc2
 */
public class Operaciones {
  public boolean Comparar(char  primero [], char  segundo []){
      if (primero.length != segundo.length){ 
          return false;
      }
      for(int i = 0 ; i < primero.length ; i++){
          int valPrimero = (int)primero[i];
          int valSegundo = (int)segundo[i];
          if(valPrimero   <= 65 && valPrimero >= 122){
              if(valPrimero == valSegundo ){
                  continue;
              }
          }
          else 
          {
              if(valPrimero == valSegundo || valPrimero == valSegundo - 32 ||
                  valPrimero == valSegundo + 32){
                  continue;
              }
          }
          return false;
      }
      return true;
  }
}
