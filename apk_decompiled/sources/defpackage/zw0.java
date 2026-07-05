package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zw0 implements fh7 {
    public final /* synthetic */ int a;

    public /* synthetic */ zw0(int i) {
        this.a = i;
    }

    @Override // defpackage.fh7
    public final hh7 a(Object obj, qjc qjcVar, r4e r4eVar) {
        switch (this.a) {
            case 0:
                dli dliVar = (dli) obj;
                if (jqi.e(dliVar)) {
                    return new bx0(dliVar, qjcVar, 0);
                }
                return null;
            case 1:
                return new er1((Bitmap) obj);
            case 2:
                return new k12((byte[]) obj, qjcVar, 0);
            case 3:
                return new k12((ByteBuffer) obj, qjcVar, 1);
            case 4:
                dli dliVar2 = (dli) obj;
                if (x44.r(dliVar2.c, "content")) {
                    return new bx0(dliVar2, qjcVar, 1);
                }
                return null;
            case 5:
                dli dliVar3 = (dli) obj;
                if (x44.r(dliVar3.c, "data")) {
                    return new bx0(dliVar3, qjcVar, 2);
                }
                return null;
            case 6:
                return new k12((Drawable) obj, qjcVar, 2);
            case 7:
                dli dliVar4 = (dli) obj;
                String str = dliVar4.c;
                if ((str != null && !x44.r(str, "file")) || dliVar4.e == null || jqi.e(dliVar4)) {
                    return null;
                }
                return new gk7(dliVar4, qjcVar);
            case 8:
                dli dliVar5 = (dli) obj;
                if (x44.r(dliVar5.c, "jar:file")) {
                    return new pd9(dliVar5, qjcVar);
                }
                return null;
            default:
                dli dliVar6 = (dli) obj;
                if (x44.r(dliVar6.c, "android.resource")) {
                    return new bx0(dliVar6, qjcVar, 3);
                }
                return null;
        }
    }
}
