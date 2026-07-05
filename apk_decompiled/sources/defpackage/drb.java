package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class drb implements KSerializer {
    public static final drb a = new drb();
    public static final kw9 b = yb5.w(w1a.F, new ulb(23));

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        ud4 ud4VarC = decoder.c(descriptor);
        boolean z = false;
        int iR = 0;
        while (true) {
            drb drbVar = a;
            int iX = ud4VarC.x(drbVar.getDescriptor());
            if (iX == -1) {
                ud4VarC.b(descriptor);
                if (z) {
                    return new DateTimeUnit.MonthBased(iR);
                }
                throw new MissingFieldException("months", getDescriptor().a());
            }
            if (iX != 0) {
                xvk.j(iX);
                throw null;
            }
            iR = ud4VarC.r(drbVar.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DateTimeUnit.MonthBased monthBased = (DateTimeUnit.MonthBased) obj;
        encoder.getClass();
        monthBased.getClass();
        SerialDescriptor descriptor = getDescriptor();
        vd4 vd4VarC = encoder.c(descriptor);
        vd4VarC.l(0, monthBased.getMonths(), a.getDescriptor());
        vd4VarC.b(descriptor);
    }
}
