package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ig2 implements xwg {
    public final List E;

    public /* synthetic */ ig2(List list) {
        this.E = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List a(s20 s20Var) {
        String str;
        int i;
        List listSingletonList;
        ssc sscVar = new ssc((byte[]) s20Var.G);
        ArrayList arrayList = this.E;
        while (sscVar.a() > 0) {
            int iZ = sscVar.z();
            int iZ2 = sscVar.b + sscVar.z();
            if (iZ == 134) {
                arrayList = new ArrayList();
                int iZ3 = sscVar.z() & 31;
                for (int i2 = 0; i2 < iZ3; i2++) {
                    String strX = sscVar.x(3, StandardCharsets.UTF_8);
                    int iZ4 = sscVar.z();
                    boolean z = (iZ4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
                    if (z) {
                        i = iZ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZ = (byte) sscVar.z();
                    sscVar.N(1);
                    if (z) {
                        boolean z2 = (bZ & 64) != 0;
                        byte[] bArr = q34.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    iw7 iw7Var = new iw7();
                    iw7Var.n = gkb.k(str);
                    iw7Var.d = strX;
                    iw7Var.K = i;
                    iw7Var.q = listSingletonList;
                    arrayList.add(new jw7(iw7Var));
                }
            }
            sscVar.M(iZ2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // defpackage.xwg
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.xwg
    public long g(int i) {
        fd9.E(i == 0);
        return 0L;
    }

    @Override // defpackage.xwg
    public List i(long j) {
        return j >= 0 ? this.E : Collections.EMPTY_LIST;
    }

    @Override // defpackage.xwg
    public int l() {
        return 1;
    }
}
