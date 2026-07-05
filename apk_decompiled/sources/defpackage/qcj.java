package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qcj extends pcj {
    public qcj(bdj bdjVar, WindowInsets windowInsets) {
        super(bdjVar, windowInsets);
    }

    @Override // defpackage.xcj
    public bdj a() {
        return bdj.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.ocj, defpackage.xcj
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcj)) {
            return false;
        }
        qcj qcjVar = (qcj) obj;
        return Objects.equals(this.c, qcjVar.c) && Objects.equals(this.g, qcjVar.g) && ocj.M(this.h, qcjVar.h);
    }

    @Override // defpackage.xcj
    public j86 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j86(displayCutout);
    }

    @Override // defpackage.xcj
    public int hashCode() {
        return this.c.hashCode();
    }

    public qcj(bdj bdjVar, qcj qcjVar) {
        super(bdjVar, qcjVar);
    }
}
