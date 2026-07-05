package defpackage;

import android.view.View;
import com.anthropic.claude.code.remote.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jl1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ jl1(ArrayList arrayList, List list, boolean z) {
        this.E = 3;
        this.G = arrayList;
        this.H = list;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 2;
        int i3 = 3;
        iei ieiVar = iei.a;
        Object obj2 = this.H;
        Object obj3 = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                View view = (View) obj3;
                mj1 mj1Var = (mj1) obj2;
                v4a v4aVar = (v4a) obj;
                v4aVar.getClass();
                if (!z) {
                    view.setKeepScreenOn(true);
                    mj1Var.X();
                }
                break;
            case 1:
                bz7 bz7Var = (bz7) obj3;
                nwb nwbVar = (nwb) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (!z || zBooleanValue) {
                    bz7Var.invoke(bool);
                } else {
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                i iVar = (i) obj3;
                leb lebVar = (leb) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (z) {
                }
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                b3d b3dVar = (b3d) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((q0a) arrayList.get(i4)).b(b3dVar, z);
                }
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((q0a) list.get(i5)).b(b3dVar, z);
                }
                break;
            case 4:
                koc kocVar = (koc) obj3;
                l45 l45Var = (l45) obj2;
                ekf ekfVar = (ekf) obj;
                if (z) {
                    lw8 lw8Var = new lw8(kocVar, l45Var, i2);
                    wn9[] wn9VarArr = ckf.a;
                    ekfVar.a(ojf.y, new e5(null, lw8Var));
                    ekfVar.a(ojf.A, new e5(null, new lw8(kocVar, l45Var, i3)));
                } else {
                    lw8 lw8Var2 = new lw8(kocVar, l45Var, 4);
                    wn9[] wn9VarArr2 = ckf.a;
                    ekfVar.a(ojf.z, new e5(null, lw8Var2));
                    ekfVar.a(ojf.B, new e5(null, new lw8(kocVar, l45Var, 5)));
                }
                break;
            case 5:
                isc iscVar = (isc) obj3;
                nwb nwbVar2 = (nwb) obj2;
                yjh yjhVar = (yjh) obj;
                yjhVar.getClass();
                if (!z && yjhVar.d()) {
                    iscVar.i((int) (yjhVar.c & 4294967295L));
                    nwbVar2.setValue(Boolean.TRUE);
                }
                break;
            case 6:
                List list2 = (List) obj3;
                bz7 bz7Var2 = (bz7) obj2;
                yw9 yw9Var = (yw9) obj;
                yw9Var.getClass();
                if (z) {
                    yw9.U(yw9Var, null, null, fsk.a, 7);
                }
                yw9Var.V(list2.size(), new zkd(new f7d(12), i2, list2), new zkd(new f7d(13), i3, list2), new ta4(-1117249557, true, new es4(i3, bz7Var2, list2)));
                break;
            case 7:
                String str = (String) obj3;
                sbg sbgVar = (sbg) obj2;
                ekf ekfVar2 = (ekf) obj;
                if (z) {
                    ckf.p(ekfVar2, 0);
                }
                fb4 fb4Var = new fb4(sbgVar, 1);
                wn9[] wn9VarArr3 = ckf.a;
                ekfVar2.a(ojf.v, new e5(null, fb4Var));
                ckf.q(ekfVar2, str);
                break;
            default:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                if (!z) {
                    str2 = str3;
                }
                ckf.v(ekfVar3, str2);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jl1(boolean z, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
        this.H = obj2;
    }
}
