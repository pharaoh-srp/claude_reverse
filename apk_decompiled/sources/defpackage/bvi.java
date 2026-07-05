package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bvi extends z2h {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvi(int i) {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
        this.e = i;
        switch (i) {
            case 1:
                super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
                break;
            case 2:
                super(R.id.tag_state_description, CharSequence.class, 64, 30);
                break;
            case 3:
                super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.z2h
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(hvi.c(view));
            case 1:
                return hvi.a(view);
            case 2:
                return jvi.b(view);
            default:
                return Boolean.valueOf(hvi.b(view));
        }
    }

    @Override // defpackage.z2h
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                hvi.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                hvi.e(view, (CharSequence) obj);
                break;
            case 2:
                jvi.c(view, (CharSequence) obj);
                break;
            default:
                hvi.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.z2h
    public final boolean f(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
