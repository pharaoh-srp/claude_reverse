package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lgd extends nig {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public lgd(long j, int i, long j2) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, ssc sscVar) {
        long jZ = sscVar.z();
        if ((128 & jZ) != 0) {
            return 8589934591L & ((((jZ & 1) << 32) | sscVar.B()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.nig
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return grc.r(this.c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return grc.r(this.c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return grc.r(this.c, " }", sb3);
        }
    }

    public lgd(long j, long j2, List list) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        Collections.unmodifiableList(list);
    }
}
