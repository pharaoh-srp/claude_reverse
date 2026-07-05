package defpackage;

import com.datadog.android.rum.internal.domain.scope.r;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class bze extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ r G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bze(r rVar, int i) {
        super(0);
        this.F = i;
        this.G = rVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        r rVar = this.G;
        switch (i) {
            case 0:
                return String.format(Locale.US, "The computed duration for the view: %s was 0. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{rVar.d.c}, 1));
            default:
                return String.format(Locale.US, "The computed duration for the view: %s was negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{rVar.d.c}, 1));
        }
    }
}
