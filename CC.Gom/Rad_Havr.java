package CC.Encycloped.Abs.Scal.Gom;

import CC.Util.By.Get_Q_By_Q;
import static CC.Encycloped.Abs.Scal.Gom.Vectr_Havr_1.Vectr_Setbl_1.Vectr_Setbl_1_Imp;

public abstract class Rad_Havr<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Setbl_1_Imp<Vectr_Typ> implements Inbl<Vectr_Typ>
{
	public Rad_Havr(double Rad){Set_Rad(Rad);}
	public Rad_Havr(){}

	public double Rad;
		public double Rad(){return Rad;}
		public void Set_Rad(double Rad){this.Rad=Rad;}

	@Override public boolean In(Bordr<Vectr_Typ> B){return false;}
}