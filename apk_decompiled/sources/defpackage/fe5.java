package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.compose.foundation.layout.b;
import androidx.media3.common.ParserException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.sessions.types.SessionResource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fe5 {
    public static final xb b = new xb(0);
    public static final o54 c = o54.X;
    public static final q0g d = q0g.L;
    public static final o54 e = o54.Z;
    public static final float f = 0.38f;
    public static final float g = 6.0f;
    public static final float h = 1.0f;
    public final /* synthetic */ int a = 5;

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2119673365);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            pzg.a(b.c(gb9.L(fqb.E, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), gm3.b(e18Var).q, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u), fd9.q0(-196640314, new x7i(i3, zy7Var), e18Var), e18Var, 12582918, 60);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 9, zy7Var);
        }
    }

    public static Bitmap d(byte[] bArr, int i, int i2) throws IOException {
        BitmapFactory.Options options;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            v67 v67Var = new v67(byteArrayInputStream);
            byteArrayInputStream.close();
            int iL = v67Var.l();
            if (iL == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iL);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static int f(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean g(SessionResource sessionResource) {
        sessionResource.getClass();
        String title = sessionResource.getTitle();
        return title != null && (bsg.u0(title, "__CBU_POOLED__", false) || bsg.u0(title, "__warming__", false));
    }

    public static boolean h(hrd hrdVar) {
        boolean z;
        if (hrdVar == null) {
            a(0);
            throw null;
        }
        if (hrdVar.getKind() != 2) {
            bo5 bo5VarH = hrdVar.h();
            if (bo5VarH == null) {
                a(1);
                throw null;
            }
            if (m06.l(bo5VarH)) {
                bo5 bo5VarH2 = bo5VarH.h();
                if (m06.n(bo5VarH2, 1) || m06.n(bo5VarH2, 3)) {
                    qqb qqbVar = (qqb) bo5VarH;
                    LinkedHashSet linkedHashSet = o84.a;
                    LinkedHashSet linkedHashSet2 = o84.a;
                    if (m06.l(qqbVar)) {
                        LinkedHashSet linkedHashSet3 = o84.a;
                        gh3 gh3VarF = o06.f(qqbVar);
                        if (w44.G0(linkedHashSet3, gh3VarF != null ? gh3VarF.f() : null)) {
                            z = true;
                        }
                        if (z) {
                        }
                        return true;
                    }
                    z = false;
                    if (z) {
                    }
                    return true;
                }
            }
            if (m06.l(hrdVar.h())) {
                nh7 nh7VarV = hrdVar.V();
                if ((nh7VarV == null || !nh7VarV.getAnnotations().x(lj9.a)) ? hrdVar.getAnnotations().x(lj9.a) : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean i(SessionResource sessionResource) {
        sessionResource.getClass();
        if (sessionResource.getEnvironment_id().length() != 0) {
            return false;
        }
        String self_hosted_runner_pool_id = sessionResource.getSelf_hosted_runner_pool_id();
        return (self_hosted_runner_pool_id == null || self_hosted_runner_pool_id.length() == 0) && !sessionResource.isAgentOwned();
    }

    public abstract String c();

    public String toString() {
        switch (this.a) {
            case 5:
                return c();
            default:
                return super.toString();
        }
    }
}
