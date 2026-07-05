package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public class gl7 extends a36 {
    public final Handler O0 = new Handler(Looper.getMainLooper());
    public final k51 P0 = new k51(6, this);
    public qq1 Q0;
    public int R0;
    public int S0;
    public ImageView T0;
    public TextView U0;

    @Override // defpackage.cx7
    public final void A() {
        this.i0 = true;
        qq1 qq1Var = this.Q0;
        qq1Var.w = 0;
        qq1Var.h(1);
        this.Q0.g(m(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // defpackage.a36
    public final Dialog I() {
        at atVar = new at(F());
        xv8 xv8Var = this.Q0.d;
        CharSequence charSequenceM = null;
        CharSequence charSequence = xv8Var != null ? (CharSequence) xv8Var.F : null;
        ws wsVar = (ws) atVar.G;
        wsVar.d = charSequence;
        View viewInflate = LayoutInflater.from(wsVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            xv8 xv8Var2 = this.Q0.d;
            CharSequence charSequence2 = xv8Var2 != null ? (CharSequence) xv8Var2.G : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence2);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.Q0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.T0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.U0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (mvk.f(this.Q0.e())) {
            charSequenceM = m(R.string.confirm_device_credential_password);
        } else {
            qq1 qq1Var = this.Q0;
            String str = qq1Var.i;
            if (str != null) {
                charSequenceM = str;
            } else {
                xv8 xv8Var3 = qq1Var.d;
                if (xv8Var3 != null && (charSequenceM = (CharSequence) xv8Var3.H) == null) {
                    charSequenceM = "";
                }
            }
        }
        pq1 pq1Var = new pq1(this);
        wsVar.f = charSequenceM;
        wsVar.g = pq1Var;
        wsVar.k = viewInflate;
        bt btVarI = atVar.i();
        btVarI.setCanceledOnTouchOutside(false);
        return btVarI;
    }

    public final int J(int i) {
        Context contextJ = j();
        fx7 fx7VarH = h();
        if (contextJ == null || fx7VarH == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextJ.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = fx7VarH.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.a36, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        qq1 qq1Var = this.Q0;
        if (qq1Var.v == null) {
            qq1Var.v = new bvb();
        }
        qq1.j(qq1Var.v, Boolean.TRUE);
    }

    @Override // defpackage.a36, defpackage.cx7
    public final void v(Bundle bundle) {
        super.v(bundle);
        fx7 fx7VarH = h();
        if (fx7VarH != null) {
            dyi dyiVarF = fx7VarH.f();
            zxi zxiVarL = fx7VarH.l();
            sub subVarD = fx7VarH.d();
            zxiVarL.getClass();
            dpf dpfVar = new dpf(dyiVarF, zxiVarL, subVarD);
            pl9 pl9VarB = jce.a.b(qq1.class);
            String strD = pl9VarB.d();
            if (strD == null) {
                sz6.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            qq1 qq1Var = (qq1) dpfVar.L(pl9VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
            this.Q0 = qq1Var;
            if (qq1Var.x == null) {
                qq1Var.x = new bvb();
            }
            qq1Var.x.d(this, new ro6(2, this));
            qq1 qq1Var2 = this.Q0;
            if (qq1Var2.y == null) {
                qq1Var2.y = new bvb();
            }
            qq1Var2.y.d(this, new ax5(8, this));
        }
        this.R0 = J(fl7.a());
        this.S0 = J(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.cx7
    public final void z() {
        this.i0 = true;
        this.O0.removeCallbacksAndMessages(null);
    }
}
