package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.Util.By.Get_Q_By_Q;

import java.util.HashMap;
import java.util.Map;

public class Physc_Map_Object<Vectr_Typ extends Get_Q_By_Q> implements SpAc_Object<Vectr_Typ>
{
	public Physc_Map_Object(Map<String,Phys_Com<Vectr_Typ>> Physg){this.Physg=Physg;}
	public Physc_Map_Object(Object... Physg)
	{
		Map<String,Phys_Com<Vectr_Typ>> P=new HashMap<>();
		for(int IndX=0;IndX<Physg.length;IndX+=2){P.put((String)Physg[IndX],(Phys_Com<Vectr_Typ>)Physg[IndX+1]);}
		this.Physg=P;
	}

	public Map<String,Phys_Com<Vectr_Typ>> Physg;

	@Override
	public void Ad_To_Spac(SpAc<Vectr_Typ> Spac)
	{
		for(Phys_Com<Vectr_Typ> Phys:Physg.values()){Spac.Ad_Phys_Com(Phys);}
	}
}