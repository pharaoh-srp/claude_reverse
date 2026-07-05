package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.types.strings.SessionId;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class kk1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(c cVar, String str, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.G = cVar;
        this.H = str;
        this.F = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        boolean z = this.F;
        Object obj2 = this.H;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                return new kk1(this.F, (zy7) obj3, (nwb) obj2, tp4Var, 0);
            case 1:
                return new kk1(this.F, (View) obj3, (mj1) obj2, tp4Var, 1);
            case 2:
                return new kk1(z, (nwb) obj2, (isc) obj3, tp4Var);
            case 3:
                return new kk1((c) obj3, (String) obj2, z, tp4Var);
            default:
                return new kk1(this.F, (u6j) obj3, (Bitmap) obj2, tp4Var, 4);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((kk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((kk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                ((kk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            case 3:
                ((kk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((kk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.H;
        boolean z = this.F;
        switch (i) {
            case 0:
                nwb nwbVar = (nwb) obj3;
                sf5.h0(obj);
                if (!z && ((Boolean) nwbVar.getValue()).booleanValue()) {
                    nwbVar.setValue(Boolean.FALSE);
                    ((zy7) obj2).a();
                }
                return ieiVar;
            case 1:
                sf5.h0(obj);
                if (!z) {
                    ((View) obj2).setKeepScreenOn(true);
                    ((mj1) obj3).X();
                }
                return ieiVar;
            case 2:
                isc iscVar = (isc) obj2;
                nwb nwbVar2 = (nwb) obj3;
                sf5.h0(obj);
                if (z && !((Boolean) nwbVar2.getValue()).booleanValue()) {
                    iscVar.i(iscVar.h() + 1);
                }
                nwbVar2.setValue(Boolean.valueOf(z));
                return ieiVar;
            case 3:
                sf5.h0(obj);
                c cVar = (c) obj2;
                String str = (String) obj3;
                cVar.y.setValue(str != null ? SessionId.m1114boximpl(str) : null);
                cVar.z.setValue(Boolean.valueOf(z));
                return ieiVar;
            default:
                sf5.h0(obj);
                int i2 = z ? 100 : 80;
                int iMin = Math.min(80, 10);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000000);
                Bitmap bitmap = (Bitmap) obj3;
                int size = 0;
                while (true) {
                    if ((size == 0 || size > 10485760) && i2 > iMin) {
                        Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT >= 30 ? z ? Bitmap.CompressFormat.WEBP_LOSSLESS : Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
                        byteArrayOutputStream.reset();
                        bitmap.compress(compressFormat, i2, byteArrayOutputStream);
                        size = byteArrayOutputStream.size();
                        i2 -= (size <= 10485760 || size - 10485760 <= 4000000) ? 7 : 15;
                        z = false;
                    }
                }
                return byteArrayOutputStream;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(boolean z, nwb nwbVar, isc iscVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.F = z;
        this.H = nwbVar;
        this.G = iscVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk1(boolean z, Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = z;
        this.G = obj;
        this.H = obj2;
    }
}
