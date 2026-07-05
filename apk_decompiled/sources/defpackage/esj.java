package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.google.firebase.encoders.EncodingException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class esj implements uac {
    public static final Charset f = Charset.forName("UTF-8");
    public static final mh7 g = new mh7("key", ebh.t(fsh.s(vrj.class, new uqj(1))));
    public static final mh7 h = new mh7(ExperienceToggle.DEFAULT_PARAM_KEY, ebh.t(fsh.s(vrj.class, new uqj(2))));
    public static final urj i = urj.c;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final tac d;
    public final avd e = new avd(this, 2);

    public esj(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, tac tacVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = tacVar;
    }

    public static int g(mh7 mh7Var) {
        vrj vrjVar = (vrj) mh7Var.a(vrj.class);
        if (vrjVar != null) {
            return vrjVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.uac
    public final uac a(mh7 mh7Var, Object obj) {
        b(mh7Var, obj, true);
        return this;
    }

    public final void b(mh7 mh7Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((g(mh7Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                b(mh7Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                h(i, mh7Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((g(mh7Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == MTTypesetterKt.kLineSkipLimitMultiplier) {
                return;
            }
            i((g(mh7Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            f(mh7Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(mh7Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((g(mh7Var) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        tac tacVar = (tac) this.b.get(obj.getClass());
        if (tacVar != null) {
            h(tacVar, mh7Var, obj, z);
            return;
        }
        uqi uqiVar = (uqi) this.c.get(obj.getClass());
        if (uqiVar != null) {
            avd avdVar = this.e;
            avdVar.b = false;
            avdVar.d = mh7Var;
            avdVar.c = z;
            uqiVar.a(obj, avdVar);
            return;
        }
        if (obj instanceof jrj) {
            c(mh7Var, ((jrj) obj).zza(), true);
        } else if (obj instanceof Enum) {
            c(mh7Var, ((Enum) obj).ordinal(), true);
        } else {
            h(this.d, mh7Var, obj, z);
        }
    }

    public final void c(mh7 mh7Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        vrj vrjVar = (vrj) mh7Var.a(vrj.class);
        if (vrjVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = vrjVar.zzb().ordinal();
        if (iOrdinal == 0) {
            i(vrjVar.zza() << 3);
            i(i2);
        } else if (iOrdinal == 1) {
            i(vrjVar.zza() << 3);
            i((i2 + i2) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((vrjVar.zza() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    @Override // defpackage.uac
    public final /* synthetic */ uac d(mh7 mh7Var, int i2) {
        c(mh7Var, i2, true);
        return this;
    }

    @Override // defpackage.uac
    public final /* synthetic */ uac e(mh7 mh7Var, long j) throws IOException {
        f(mh7Var, j, true);
        return this;
    }

    public final void f(mh7 mh7Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        vrj vrjVar = (vrj) mh7Var.a(vrj.class);
        if (vrjVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = vrjVar.zzb().ordinal();
        if (iOrdinal == 0) {
            i(vrjVar.zza() << 3);
            j(j);
        } else if (iOrdinal == 1) {
            i(vrjVar.zza() << 3);
            j((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((vrjVar.zza() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void h(tac tacVar, mh7 mh7Var, Object obj, boolean z) throws IOException {
        g3a g3aVar = new g3a(2);
        g3aVar.F = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = g3aVar;
            try {
                tacVar.a(obj, this);
                this.a = outputStream;
                long j = g3aVar.F;
                g3aVar.close();
                if (z && j == 0) {
                    return;
                }
                i((g(mh7Var) << 3) | 2);
                j(j);
                tacVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g3aVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void i(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                i2 >>>= 7;
            }
        }
    }

    public final void j(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | FreeTypeConstants.FT_LOAD_PEDANTIC);
                j >>>= 7;
            }
        }
    }
}
