package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Ld00;", "Lnqb;", "Ltz;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class d00 extends nqb {
    public final /* synthetic */ AndroidComposeView E;

    public d00(AndroidComposeView androidComposeView) {
        this.E = androidComposeView;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new tz(this.E);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final /* bridge */ /* synthetic */ void update(hqb hqbVar) {
    }
}
