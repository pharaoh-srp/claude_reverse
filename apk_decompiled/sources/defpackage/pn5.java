package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class pn5 implements KSerializer {
    public static final pn5 a = new pn5();
    public static final kw9 b = yb5.w(w1a.F, new h85(15));

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        ud4 ud4VarC = decoder.c(descriptor);
        boolean z = false;
        int iR = 0;
        while (true) {
            pn5 pn5Var = a;
            int iX = ud4VarC.x(pn5Var.getDescriptor());
            if (iX == -1) {
                ud4VarC.b(descriptor);
                if (z) {
                    return new DateTimeUnit.DayBased(iR);
                }
                throw new MissingFieldException("days", getDescriptor().a());
            }
            if (iX != 0) {
                xvk.j(iX);
                throw null;
            }
            iR = ud4VarC.r(pn5Var.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DateTimeUnit.DayBased dayBased = (DateTimeUnit.DayBased) obj;
        encoder.getClass();
        dayBased.getClass();
        SerialDescriptor descriptor = getDescriptor();
        vd4 vd4VarC = encoder.c(descriptor);
        vd4VarC.l(0, dayBased.getDays(), a.getDescriptor());
        vd4VarC.b(descriptor);
    }
}
