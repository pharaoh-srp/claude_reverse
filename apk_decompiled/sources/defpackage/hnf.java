package defpackage;

import io.sentry.e0;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.YearMonth;

/* JADX INFO: loaded from: classes3.dex */
public final class hnf implements Externalizable {
    public int E;
    public Serializable F;

    public hnf(int i, Serializable serializable) {
        this.E = i;
        this.F = serializable;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable localDate;
        objectInput.getClass();
        byte b = objectInput.readByte();
        this.E = b;
        if (b == 2) {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(objectInput.readLong());
            localDateOfEpochDay.getClass();
            localDate = new kotlinx.datetime.LocalDate(localDateOfEpochDay);
        } else if (b == 3) {
            yda ydaVar = LocalTime.Companion;
            long j = objectInput.readLong();
            ydaVar.getClass();
            try {
                localDate = new LocalTime(java.time.LocalTime.ofNanoOfDay(j));
            } catch (DateTimeException e) {
                e0.i(e);
                return;
            }
        } else if (b == 4) {
            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(objectInput.readLong());
            localDateOfEpochDay2.getClass();
            kotlinx.datetime.LocalDate localDate2 = new kotlinx.datetime.LocalDate(localDateOfEpochDay2);
            yda ydaVar2 = LocalTime.Companion;
            long j2 = objectInput.readLong();
            ydaVar2.getClass();
            try {
                localDate = new LocalDateTime(localDate2, new LocalTime(java.time.LocalTime.ofNanoOfDay(j2)));
            } catch (DateTimeException e2) {
                e0.i(e2);
                return;
            }
        } else if (b == 10) {
            localDate = epi.a(null, null, Integer.valueOf(objectInput.readInt()));
        } else {
            if (b != 11) {
                throw new IOException("Unknown type tag: " + this.E);
            }
            djj djjVar = YearMonth.Companion;
            long j3 = objectInput.readLong();
            u0h u0hVar = ljj.a;
            djjVar.getClass();
            long j4 = j3 / 12;
            if ((j3 ^ 12) < 0 && j4 * 12 != j3) {
                j4--;
            }
            long j5 = j3 % 12;
            localDate = new YearMonth((int) (j4 + 1970), ((int) (j5 + (12 & (((j5 ^ 12) & ((-j5) | j5)) >> 63)))) + 1);
        }
        this.F = localDate;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.E);
        Serializable serializable = this.F;
        int i = this.E;
        if (i == 2) {
            objectOutput.writeLong(((kotlinx.datetime.LocalDate) serializable).getValue().toEpochDay());
            return;
        }
        if (i == 3) {
            objectOutput.writeLong(((LocalTime) serializable).toNanosecondOfDay());
            return;
        }
        if (i == 4) {
            LocalDateTime localDateTime = (LocalDateTime) serializable;
            objectOutput.writeLong(localDateTime.getDate().getValue().toEpochDay());
            objectOutput.writeLong(localDateTime.getTime().toNanosecondOfDay());
        } else if (i == 10) {
            objectOutput.writeInt(((UtcOffset) serializable).getTotalSeconds());
        } else {
            if (i != 11) {
                poc.i(this.E, " for value: ", serializable, "Unknown type tag: ");
                return;
            }
            YearMonth yearMonth = (YearMonth) serializable;
            u0h u0hVar = ljj.a;
            objectOutput.writeLong((((((long) yearMonth.getYear()) - 1970) * 12) + ((long) yearMonth.getMonthNumber$kotlinx_datetime())) - 1);
        }
    }
}
