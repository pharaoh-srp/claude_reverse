package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gr5 implements zd7 {
    public static final int[] K = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final i49 L = new i49(new ep5(20));
    public static final i49 M = new i49(new ep5(21));
    public vde E;
    public int I;
    public int J;
    public bm4 G = new bm4();
    public boolean F = true;
    public int H = 3;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new v4());
                break;
            case 1:
                arrayList.add(new x4());
                break;
            case 2:
                arrayList.add(new ef());
                break;
            case 3:
                arrayList.add(new sw());
                break;
            case 4:
                wd7 wd7VarC0 = L.C0(0);
                if (wd7VarC0 == null) {
                    arrayList.add(new wm7());
                } else {
                    arrayList.add(wd7VarC0);
                }
                break;
            case 5:
                arrayList.add(new tr7());
                break;
            case 6:
                arrayList.add(new rwa(this.G, this.F ? 0 : 2));
                break;
            case 7:
                arrayList.add(new rsb());
                break;
            case 8:
                bm4 bm4Var = this.G;
                int i2 = this.H;
                int i3 = (i2 & 1) != 0 ? 64 : 0;
                if ((i2 & 2) != 0) {
                    i3 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                }
                arrayList.add(new dy7(bm4Var, (this.F ? 0 : 32) | i3));
                bm4 bm4Var2 = this.G;
                int i4 = this.H;
                int i5 = (i4 & 1) == 0 ? 0 : 32;
                if ((2 & i4) != 0) {
                    i5 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                }
                arrayList.add(new zsb(bm4Var2, i5 | (this.F ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new tcc());
                break;
            case 10:
                arrayList.add(new pvd());
                break;
            case 11:
                if (this.E == null) {
                    iz8 iz8Var = nz8.F;
                    this.E = vde.I;
                }
                arrayList.add(new p8i(!this.F ? 1 : 0, this.G, new frh(0L), new ig2(this.E)));
                break;
            case 12:
                arrayList.add(new l6j());
                break;
            case 14:
                arrayList.add(new et1(this.I));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                wd7 wd7VarC02 = M.C0(new Object[0]);
                if (wd7VarC02 != null) {
                    arrayList.add(wd7VarC02);
                }
                break;
            case 16:
                arrayList.add(new aa1(!this.F ? 1 : 0, this.G));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                arrayList.add(new et1((byte) 0, 1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                arrayList.add(new da1(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                arrayList.add(new et1((byte) 0, 0));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                arrayList.add(new fm8(this.J));
                break;
            case 21:
                arrayList.add(new da1(0));
                break;
        }
    }

    @Override // defpackage.zd7
    public final synchronized wd7[] d() {
        return f(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0240 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:178:0x0254, B:181:0x025a, B:182:0x025d, B:183:0x0260, B:14:0x002d), top: B:188:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0254 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:178:0x0254, B:181:0x025a, B:182:0x025d, B:183:0x0260, B:14:0x002d), top: B:188:0x0003 }] */
    @Override // defpackage.zd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.wd7[] f(android.net.Uri r28, java.util.Map r29) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr5.f(android.net.Uri, java.util.Map):wd7[]");
    }
}
