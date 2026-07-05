package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jb extends hh0 implements lb {
    public final /* synthetic */ kb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(kb kbVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.H = kbVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        b2i.a(this, getContentDescription());
        setOnTouchListener(new fb(this, this));
    }

    @Override // defpackage.lb
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lb
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.H.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
