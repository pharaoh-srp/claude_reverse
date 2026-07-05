package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anthropic.claude.R;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class x7b implements zn1 {
    public Object a;
    public Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public final Object i;

    public x7b(Context context, zy7 zy7Var) {
        zy7Var.getClass();
        this.a = zy7Var;
        this.b = MediaPlayer.create(context, R.raw.enter);
        this.c = MediaPlayer.create(context, R.raw.exit);
        this.d = MediaPlayer.create(context, R.raw.user_input_end);
        this.e = MediaPlayer.create(context, R.raw.reconnected);
        this.f = MediaPlayer.create(context, R.raw.disconnected);
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, R.raw.reconnecting);
        this.g = mediaPlayerCreate;
        this.h = MediaPlayer.create(context, R.raw.reconnecting);
        MediaPlayer mediaPlayerCreate2 = MediaPlayer.create(context, R.raw.processing);
        this.i = mediaPlayerCreate2;
        if (mediaPlayerCreate != null) {
            mediaPlayerCreate.setLooping(true);
        }
        if (mediaPlayerCreate2 != null) {
            mediaPlayerCreate2.setLooping(true);
        }
    }

    public static void k(FrameLayout frameLayout) {
        f88 f88Var = f88.d;
        Context context = frameLayout.getContext();
        int iC = f88Var.c(context, g88.a);
        String strC = pmj.c(context, iC);
        String strB = pmj.b(context, iC);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = f88Var.b(iC, context, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(android.R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new p1i(context, intentB));
        }
    }

    @Override // defpackage.zn1
    public void a(boolean z) {
        j((MediaPlayer) this.i, z);
    }

    @Override // defpackage.zn1
    public void b(boolean z) {
        MediaPlayer mediaPlayer = (MediaPlayer) this.c;
        MediaPlayer mediaPlayer2 = (MediaPlayer) this.b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        if (z && mediaPlayer != null) {
            try {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new w7b(1));
            } catch (IllegalStateException unused) {
                mediaPlayer.release();
            }
        } else if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer3 = (MediaPlayer) this.d;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
        }
        MediaPlayer mediaPlayer4 = (MediaPlayer) this.e;
        if (mediaPlayer4 != null) {
            mediaPlayer4.release();
        }
        MediaPlayer mediaPlayer5 = (MediaPlayer) this.f;
        if (mediaPlayer5 != null) {
            mediaPlayer5.release();
        }
        MediaPlayer mediaPlayer6 = (MediaPlayer) this.g;
        if (mediaPlayer6 != null) {
            mediaPlayer6.release();
        }
        MediaPlayer mediaPlayer7 = (MediaPlayer) this.h;
        if (mediaPlayer7 != null) {
            mediaPlayer7.release();
        }
        MediaPlayer mediaPlayer8 = (MediaPlayer) this.i;
        if (mediaPlayer8 != null) {
            mediaPlayer8.release();
        }
    }

    @Override // defpackage.zn1
    public void c() {
        i((MediaPlayer) this.h);
    }

    @Override // defpackage.zn1
    public void d(boolean z) {
        j((MediaPlayer) this.g, z);
    }

    @Override // defpackage.zn1
    public void e() {
        i((MediaPlayer) this.b);
    }

    @Override // defpackage.zn1
    public void f() {
        i((MediaPlayer) this.d);
    }

    @Override // defpackage.zn1
    public void g() {
        i((MediaPlayer) this.f);
    }

    @Override // defpackage.zn1
    public void h() {
        i((MediaPlayer) this.e);
    }

    public void i(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null || ((Boolean) ((zy7) this.a).a()).booleanValue()) {
            return;
        }
        try {
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new w7b(0));
        } catch (IllegalStateException unused) {
        }
    }

    public void j(MediaPlayer mediaPlayer, boolean z) {
        boolean zIsPlaying;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            try {
                if (!((Boolean) ((zy7) this.a).a()).booleanValue()) {
                    mediaPlayer.start();
                    return;
                }
            } catch (IllegalStateException unused) {
                return;
            }
        }
        if (z) {
            return;
        }
        try {
            zIsPlaying = mediaPlayer.isPlaying();
        } catch (IllegalStateException unused2) {
            zIsPlaying = false;
        }
        if (zIsPlaying) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
    }

    public void l(int i) {
        while (!((LinkedList) this.c).isEmpty() && ((mnj) ((LinkedList) this.c).getLast()).a() >= i) {
            ((LinkedList) this.c).removeLast();
        }
    }

    public void m(Bundle bundle, mnj mnjVar) {
        if (((lrb) this.a) != null) {
            mnjVar.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(mnjVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.g = (fnf) this.d;
        if (((lrb) this.a) == null) {
            try {
                Context context = (Context) this.f;
                synchronized (rta.class) {
                    rta.l(context);
                }
                exk exkVarP = npk.i(context).P(new cbc(context), (GoogleMapOptions) this.h);
                if (exkVarP == null) {
                    return;
                }
                ((fnf) this.g).k(new lrb((kta) this.e, exkVarP));
                ArrayList arrayList = (ArrayList) this.i;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((lrb) this.a).I((r88) it.next());
                }
                arrayList.clear();
            } catch (RemoteException e) {
                poc.q(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public x7b(kta ktaVar, Context context, GoogleMapOptions googleMapOptions) {
        this.d = new fnf(15, this);
        this.i = new ArrayList();
        this.e = ktaVar;
        this.f = context;
        this.h = googleMapOptions;
    }
}
