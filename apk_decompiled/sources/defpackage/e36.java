package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e36 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                if ((view instanceof txi) && (outline2 = ((txi) view).I) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
        }
    }
}
