package CC.Encycloped.Abs.Scal.Gom;

import CC.Math.Line;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Dim;

public interface ROtr_IndX extends ROtr_ID
{
	default boolean Has_Dim(Line Dim){return Dim(Dim)<Dim_Num();}

	float Rot_Flot(int A,int B);
		@Override default float Rot_Flot(Line A,Line B){return Rot_Flot(Dim(A),Dim(B));}
	double Rot_Dubl(int A,int B);
		@Override default double Rot_Dub(Line A,Line B){return Rot_Dubl(Dim(A),Dim(B));}
	void Set_Rot(int A,int B,float Rot);
		@Override default void Set_Rot(Line A,Line B,float Rot){Set_Rot(Dim(A),Dim(B),Rot);}
	void Set_Rot(int A,int B,double Rot);
		@Override default void Set_Rot(Line A,Line B,double Rot){Set_Rot(Dim(A),Dim(B),Rot);}
}