package CC.Encycloped.Abs.Scal.Gom.Scrut;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import static CC.Math.Math_Plus.Ad_Mag;
import static CC.Math.Math_Plus.ScAl;
import static CC.Util.Bool.Point2_Bool.ID;
import static CC.Util.Fun.V.V;
import static java.lang.Math.sqrt;
import CC.Encycloped.Abs.Scal.Gom.*;
import CC.Encycloped.Abs.Scal.Gom.DN.DN_.Geom;
import CC.Math.*;
import CC.Util.By.Set.Set_Dubl_By_Point;
import CC.List.Ara_Util;
import CC.List.Hash_Map_Plus;
import java.util.ArrayList;
import java.util.HashMap;

public class Vec_2<Vectr_Typ>
{
	public static final Clas_Rap Class=Init_StRt(Vec_2.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Vec_2(Slider[] Cordg){this.Cordg=Cordg;}
	public Vec_2(double[] Locg,Line[] Dimg){for(int Cord=0;Cord<Dimg.length;Cord+=1)
	{
		Cordg=new Slider[Locg.length];
		Cordg[Cord]=new Slider(Dimg[Cord],Locg[Cord]);
	}}
	public Vec_2(Vec_2 Stm,double[] Posg,Line[] Dimg)
	{
		Set_Stm(Stm);
		for(int Cord=0;Cord<Dimg.length;Cord+=1){Mov_Cord(Dimg[Cord],Posg[Cord]);}
	}
	public Vec_2(){}

	public Slider[] Cordg=new Slider[0];
	/**Same=same dimension order*/
	public void Ad_Cord(Slider Cord){Cordg=Ara_Util.Ad(Cordg,Cord);}
	public void Ad_Cord(double Loc,Line Dim){Cordg=Ara_Util.Ad(Cordg,new Slider(Dim,Loc));}
	public double Cord(Line Dim)
	{
		for(Slider Cord: Cordg){if(Cord.On==Dim){return Cord.Loc;}}

		return 0;
	}
	public Slider Cord_Slidr(Line Dim)
	{
		for(Slider Cord:Cordg){if(Cord.On==Dim){return Cord;}}
		return null;
	}
	public double[] Loc_Sam()
	{
		int Cord_Num=this.Cordg.length;
		double[] Cordg=new double[Cord_Num];
		for(int Cord=0;Cord<Cord_Num;Cord+=1){Cordg[Cord]=this.Cordg[Cord].Loc;}

		return Cordg;
	}
	public Hash_Map_Plus<Line,Double> Loc(){return null;}
	public void Set_Cord(Line Dim,double Loc)
	{
		Slider Cord=Cord_Slidr(Dim);
		if(Cord!=null){Cord.Loc=Loc;}
		else{Ad_Cord(Loc,Dim);}
	}
	public void Set_Loc(double[] Cordg){for(int IndX=0;IndX<Cordg.length;IndX+=1){this.Cordg[IndX].Loc=Cordg[IndX];}}
	public void Set_Loc(double[] Locg,Line[] Dimg){for(int Cord=0;Cord<Dimg.length;Cord+=1){Cord_Slidr(Dimg[Cord]).Loc=Locg[Cord];}}
	public void Mov_Cord(Line Dim,double Mov)
	{
		Slider Cord=Cord_Slidr(Dim);
		if(Cord!=null){Cord.Loc+=Mov;}
		else{Ad_Cord(Mov,Dim);}
	}
	public void Mov_Loc(double[] Cordg){for(int IndX=0;IndX<Cordg.length;IndX+=1){this.Cordg[IndX].Loc+=Cordg[IndX];}}
	public void Mov_Loc(double[] Locg,Line[] Dimj){for(int Cord=0;Cord<Dimj.length;Cord+=1){Cord_Slidr(Dimj[Cord]).Loc+=Locg[Cord];}}
	public void Rem_Cord(Line Dim)
	{
		for(Slider Cord: Cordg){if(Cord.On==Dim)
		{
			//Cord_List Cord;
			return;
		}}
	}

	public ArrayList<Line> Plang=new ArrayList<>();
	public ArrayList<Double> Anglg=new ArrayList<>();

	public Vec_2 Stem;
		public void Set_Stm(Vec_2 Stem)
		{
			this.Stem=Stem;
			Set_Rel_Loc();
		}
	public ArrayList<Double> Rel_Cordg=new ArrayList<>();
	public void Ad_Rel_Cord(Line Dim,Double Loc)
	{
		if(Stem!=null)
		{
			Slider Stem_Cord=Stem.Cord_Slidr(Dim);
			//Cord_List.add(new Slider(Dim,(Stem_Cord!=null)?Stem_Cord.Loc+Loc:Loc));
		}
		//else{Cord_List.add(new Slider(Dim,Loc));}
		Rel_Cordg.add(Loc);
	}
	public static double[] RL_Loc(Vec_2 Origin,Vec_2 Vectr)
	{
		//*
		Slider[] Orig_Cordg=Origin.Cordg;
		Slider[] Vectr_Cordg=Vectr.Cordg;
		int Cord_Num=ID.Uniq_Num(new ArrayList<>(),V(Orig_Cordg,Vectr_Cordg));
		double[] Rel_Cord_List=new double[Cord_Num];
		int Cord=0;
					/*for(;Cord<Orig_Dim_List.size();Cord+=1)
					{
						Line Dim=Orig_Dim_List.get(Cord);
						int Index=Vectr_Cordg.indexOf(Dim);
						if(Index!=-1)
						{
							Rel_Cord_List[Cord]=Math_Plus.Rel_Num(Orig_Loc_List.get(Index).Loc,Vect_Loc_List.get(Index).Loc);
						}
					}
					for(;Cord<Vectr_Cordg.size();Cord+=1)
					{
						Line Dim=Vect_Dim_List.get(Cord);
						if(!Orig_Dim_List.contains(Dim))
						{

						}
					}*/

		return Rel_Cord_List;
	}
	public double[] RL_Loc(Vec_2 Vectr){return RL_Loc(this,Vectr);}
	public static double[] Rel_Loc_Sam(Vec_2 Origin,Vec_2 Vectr)
	{
		int Cord_Num=Origin.Cordg.length;
		double[] Rel_Loc=new double[Cord_Num];
		for(int Cord=0;Cord<Cord_Num;Cord+=1){Rel_Loc[Cord]=Math_Plus.RL_Num(Origin.Cordg[Cord].Loc,Vectr.Cordg[Cord].Loc);}

		return Rel_Loc;
	}
	public static double[] Rel_Loc_Sam_Rot(Vec_2 Origin,Vec_2 Vector,Slider[] Rot_List)
	{
		double[] Loc=RL_Loc(Origin,Vector);

		int Rot_IndX=0;
		int Rot_Num=Rot_List.length;
		int Combin=Rot_Num-1;
		int Cap=0;
		Line Y;
		int Y_IndX=0;
		Line Z;
		int Z_IndX;
		double Y_Cord;
		double Z_Cord;

		double Y_Updat;
		Double Z_Updat;
		int Lost_Unused_Z_Ind=1;
		for(Cap+=Combin;Combin>0;Combin--)
		{
			Y_IndX++;
			Y=((Rot_2)Rot_List[Rot_IndX].On).A;
			for(Z_IndX=Lost_Unused_Z_Ind;Rot_IndX<Cap;Rot_IndX+=1)
			{
				Z_IndX+=1;
				Y_Cord=Vector.Cordg[Y_IndX].Loc;
				Z_Cord=Vector.Cordg[Z_IndX].Loc;
				Z=((Rot_2)Rot_List[Rot_IndX].On).B;
				double Mag=sqrt((Y_Cord*Y_Cord)+(Z_Cord*Z_Cord));
				Loc[Y_IndX]=Y_Cord/Mag;
				Loc[Z_IndX]=Z_Cord/Mag;
				//*=Magnitude;
			}
			Lost_Unused_Z_Ind+=1;
		}

		return Loc;
	}
	public void Set_Rel_Loc(){}
	public ArrayList<Double> RL_Angg=new ArrayList<>();
	public double[] Rel_Ang_Sam(Vec_2 Origin,Vec_2 Vector)
	{
		int Ang_Num=Origin.Anglg.size();
		double[] Ang_List=new double[Ang_Num];

		return Ang_List;
	}
	public Mov_Vectr Move;
	public void Move(Line[] Dim_List,double[] Loc_List)throws No_COrd_Xeptn{Move.Move((Vectr)this,Dim_List,Loc_List);}
	public static HashMap<String,Mov_Vectr> Movg=new HashMap<>();
	static
	{
		Movg.put("Lock",(Mov_Vectr)(Vectr,Dimg,Locg)->{});
		Movg.put("Teleport",(Mov_Vectr)(Vectr,Dimg,Locg)->{for(int Cord=0;Cord<Dimg.length;Cord+=1){((Set_Dubl_By_Point<Line,?>)Vectr).Set_Dubl_By_Point(Dimg[Cord],Locg[Cord]);}});
		Movg.put("Teleport_Update",(Mov_Vectr)(Vectr,Dimg,Locg)->{for(int Cord=0;Cord<Dimg.length;Cord+=1)
		{
//			Vectr.Set_Cordg(Dimg[Cord],Locg[Cord]);
			}
//			((Vec_2)Vectr).Updat_Branch_List();
		});
	}

	public ArrayList<Vectr_Typ> Branchg=new ArrayList<>();
	public void Updat_Branchg()
	{
		for(Object Branch: Branchg)
		{
			//((Vertex)Branch).
		}
	}
	public void Ad_Branch(Vec_2 Branch)
	{
		Branchg.add((Vectr_Typ)Branch);
		Branch.Set_Stm(this);
	}
	public void Rem_Branch(int IndX)
	{
		Branchg.remove(IndX);
		if(Branchg.size()==0){Move=(Mov_Vectr)Movg.get("Teleport");}
	}
	public void Rem_Branch(Vectr_Typ Branch){Rem_Branch(Branchg.indexOf(Branch));}

	public static double[] Ang_Sam(Vec_2 Origin,Vec_2 Vectr)
	{
		double[] Rel_Loc=RL_Loc(Origin,Vectr);
		int Cord_Num=Rel_Loc.length;
		double Sum=Ad_Mag(Rel_Loc);
		double[] Porg=new double[Cord_Num];
		for(int Cord=0;Cord<Cord_Num;Cord++){Porg[Cord]=Math_Plus.ScAl(Sum,Rel_Loc[Cord],1D);}

		return Porg;
	}
	public double[] Ang_Sam(Vec_2 Vectr){return Ang_Sam(this,Vectr);}

	public static HashMap<String,Transformation> Trang=new HashMap<>();
		static
		{
			Trang.put("Location",(Transformed,Parameter)->
				{
					return null;
				}
			);
			Trang.put("Rotation",(Transformed,Parameter)->
				{
					double[] Relative_Location=RL_Loc((Vec_2)Parameter,(Vec_2)Transformed);
					double Hypotenuse=Geom.Hyp_Rad(Relative_Location);

					return null;
				}
			);
			Trang.put("Location Rotation",(Transformed,Parameter)->
				{

					return new double[0];
				}
			);
		}

	static{Init_Nd(Vec_2.class);}
}