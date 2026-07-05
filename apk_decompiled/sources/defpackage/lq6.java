package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class lq6 implements KSerializer {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;
    public final kw9 d;

    public lq6(String str, Object obj) {
        obj.getClass();
        this.b = obj;
        this.c = lm6.E;
        this.d = yb5.w(w1a.F, new vc8(17, this, str));
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                decoder.getClass();
                int i2 = decoder.i(getDescriptor());
                if (i2 >= 0 && i2 < enumArr.length) {
                    return enumArr[i2];
                }
                throw new SerializationException(i2 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                decoder.getClass();
                SerialDescriptor descriptor = getDescriptor();
                ud4 ud4VarC = decoder.c(descriptor);
                int iX = ud4VarC.x(getDescriptor());
                if (iX != -1) {
                    throw new SerializationException(grc.p(iX, "Unexpected index "));
                }
                ud4VarC.b(descriptor);
                return obj;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
            case 0:
                return (SerialDescriptor) ((u0h) this.d).getValue();
            default:
                return (SerialDescriptor) this.d.getValue();
        }
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                Enum r5 = (Enum) obj;
                encoder.getClass();
                r5.getClass();
                Enum[] enumArr = (Enum[]) this.b;
                int iJ0 = mp0.J0(r5, enumArr);
                if (iJ0 != -1) {
                    encoder.t(getDescriptor(), iJ0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String strA = getDescriptor().a();
                String string = Arrays.toString(enumArr);
                string.getClass();
                sb.append(" is not a valid enum ");
                sb.append(strA);
                sb.append(", must be one of ");
                sb.append(string);
                throw new SerializationException(sb.toString());
            default:
                encoder.getClass();
                obj.getClass();
                encoder.c(getDescriptor()).b(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lq6(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.c = listAsList;
    }

    public lq6(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
        this.d = new u0h(new l80(this, 26, str));
    }
}
