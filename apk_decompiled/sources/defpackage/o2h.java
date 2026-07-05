package defpackage;

import android.os.SystemClock;
import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudPlaybackStarted;
import com.anthropic.claude.bell.tts.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o2h implements zy7 {
    public final /* synthetic */ f E;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;

    public /* synthetic */ o2h(f fVar, String str, long j) {
        this.E = fVar;
        this.F = str;
        this.G = j;
    }

    @Override // defpackage.zy7
    public final Object a() {
        this.E.d.e(new ReadAloudEvents$MobileReadAloudPlaybackStarted(this.F, SystemClock.elapsedRealtime() - this.G), ReadAloudEvents$MobileReadAloudPlaybackStarted.Companion.serializer());
        return iei.a;
    }
}
