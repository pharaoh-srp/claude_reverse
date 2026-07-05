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
public final class zud implements uac {
    public static final Charset f = Charset.forName("UTF-8");
    public static final mh7 g = new mh7("key", ebh.t(ebh.s(qud.class, new r11(1))));
    public static final mh7 h = new mh7(ExperienceToggle.DEFAULT_PARAM_KEY, ebh.t(ebh.s(qud.class, new r11(2))));
    public static final yud i = new yud(0);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final tac d;
    public final avd e = new avd(this, 0);

    public zud(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, tac tacVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = tacVar;
    }

    public static int h(mh7 mh7Var) {
        qud qudVar = (qud) mh7Var.a(qud.class);
        if (qudVar != null) {
            return qudVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.uac
    public final uac a(mh7 mh7Var, Object obj) {
        f(mh7Var, obj, true);
        return this;
    }

    public final void b(mh7 mh7Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        qud qudVar = (qud) mh7Var.a(qud.class);
        if (qudVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = qudVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(qudVar.tag() << 3);
            i(i2);
        } else if (iOrdinal == 1) {
            i(qudVar.tag() << 3);
            i((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((qudVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(mh7 mh7Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        qud qudVar = (qud) mh7Var.a(qud.class);
        if (qudVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = qudVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(qudVar.tag() << 3);
            j(j);
        } else if (iOrdinal == 1) {
            i(qudVar.tag() << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((qudVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.uac
    public final uac d(mh7 mh7Var, int i2) {
        b(mh7Var, i2, true);
        return this;
    }

    @Override // defpackage.uac
    public final uac e(mh7 mh7Var, long j) throws IOException {
        c(mh7Var, j, true);
        return this;
    }

    public final void f(mh7 mh7Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(mh7Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(mh7Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, mh7Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((h(mh7Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == MTTypesetterKt.kLineSkipLimitMultiplier) {
                return;
            }
            i((h(mh7Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(mh7Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(mh7Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(mh7Var) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        tac tacVar = (tac) this.b.get(obj.getClass());
        if (tacVar != null) {
            g(tacVar, mh7Var, obj, z);
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
        if (obj instanceof gud) {
            b(mh7Var, ((gud) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(mh7Var, ((Enum) obj).ordinal(), true);
        } else {
            g(this.d, mh7Var, obj, z);
        }
    }

    public final void g(tac tacVar, mh7 mh7Var, Object obj, boolean z) throws IOException {
        g3a g3aVar = new g3a(0);
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
                i((h(mh7Var) << 3) | 2);
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
                th2.addSuppressed(th3);
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
