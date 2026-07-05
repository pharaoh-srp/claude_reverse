package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class lph implements KSerializer {
    public static final lph a = new lph();
    public static final kw9 b = yb5.w(w1a.F, new n7h(15));

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        ud4 ud4VarC = decoder.c(descriptor);
        long j = 0;
        boolean z = false;
        while (true) {
            lph lphVar = a;
            int iX = ud4VarC.x(lphVar.getDescriptor());
            if (iX == -1) {
                ud4VarC.b(descriptor);
                if (z) {
                    return new DateTimeUnit.TimeBased(j);
                }
                throw new MissingFieldException("nanoseconds", getDescriptor().a());
            }
            if (iX != 0) {
                xvk.j(iX);
                throw null;
            }
            j = ud4VarC.j(lphVar.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) b.getValue();
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DateTimeUnit.TimeBased timeBased = (DateTimeUnit.TimeBased) obj;
        encoder.getClass();
        timeBased.getClass();
        SerialDescriptor descriptor = getDescriptor();
        vd4 vd4VarC = encoder.c(descriptor);
        vd4VarC.D(a.getDescriptor(), 0, timeBased.getNanoseconds());
        vd4VarC.b(descriptor);
    }
}
