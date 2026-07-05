package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4f F;

    public /* synthetic */ yq0(t4f t4fVar, int i) {
        this.E = i;
        this.F = t4fVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        t4f t4fVar = this.F;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                context.getClass();
                t4fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                t4fVar.setBackgroundColor(0);
                break;
            default:
                context.getClass();
                ViewParent parent = t4fVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(t4fVar);
                }
                t4fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                t4fVar.setBackgroundColor(0);
                t4fVar.setHorizontalScrollBarEnabled(false);
                t4fVar.setVerticalScrollBarEnabled(false);
                WebSettings settings = t4fVar.getSettings();
                settings.setBuiltInZoomControls(true);
                settings.setDisplayZoomControls(false);
                break;
        }
        return t4fVar;
    }
}
