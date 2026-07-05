package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class omg implements InputConnection {
    public final p60 a;
    public final wwb b = new wwb(0, new bz7[16]);
    public final d49 c;

    public omg(p60 p60Var, EditorInfo editorInfo) {
        this.a = p60Var;
        nmg nmgVar = new nmg(this, false);
        efe efeVar = new efe(28, this);
        if (editorInfo != null) {
            this.c = new d49(nmgVar, efeVar);
        } else {
            mr9.h("editorInfo must be non-null");
            throw null;
        }
    }

    public final efh a() {
        return ((i5i) this.a.G).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((zu2) this.a.E).F++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.h();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return esk.e(this.c, inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        vuk.e(this.a, charSequence.toString(), i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        vuk.f(this.a, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        vuk.g(this.a, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((zu2) this.a.E).c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        vuk.h(this.a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), kkh.g(a().H), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        return x2k.g(a());
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (kkh.d(a().H)) {
            return null;
        }
        efh efhVarA = a();
        return efhVarA.G.subSequence(kkh.g(efhVarA.H), kkh.f(efhVarA.H)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        efh efhVarA = a();
        long j = efhVarA.H;
        CharSequence charSequence = efhVarA.G;
        int iF = kkh.f(j);
        int iF2 = kkh.f(efhVarA.H);
        int length = iF2 + i;
        if (((iF2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        efh efhVarA = a();
        int iG = kkh.g(efhVarA.H);
        int i3 = iG - i;
        if (((i ^ iG) & (iG ^ i3)) < 0) {
            i3 = 0;
        }
        return efhVarA.G.subSequence(Math.max(0, i3), kkh.g(efhVarA.H)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                vuk.o(this.a, 0, a().G.length());
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L6
            switch(r3) {
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                case 7: goto L8;
                default: goto L6;
            }
        L6:
            r3 = r0
            goto L13
        L8:
            r3 = 5
            goto L13
        La:
            r3 = 7
            goto L13
        Lc:
            r3 = 6
            goto L13
        Le:
            r3 = 4
            goto L13
        L10:
            r3 = 3
            goto L13
        L12:
            r3 = 2
        L13:
            p60 r2 = r2.a
            java.lang.Object r2 = r2.I
            bz7 r2 = (defpackage.bz7) r2
            if (r2 == 0) goto L23
            ty8 r1 = new ty8
            r1.<init>(r3)
            r2.invoke(r1)
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omg.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        gsk.g(this.a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return gsk.h(this.a, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            p60 r9 = r9.a
            java.lang.Object r9 = r9.L
            nd5 r9 = (defpackage.nd5) r9
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            r3 = r10 & 2
            if (r3 == 0) goto L15
            r3 = r2
            goto L16
        L15:
            r3 = r1
        L16:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4f
            r5 = r10 & 16
            if (r5 == 0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 8
            if (r6 == 0) goto L29
            r6 = r2
            goto L2a
        L29:
            r6 = r1
        L2a:
            r7 = r10 & 4
            if (r7 == 0) goto L30
            r7 = r2
            goto L31
        L30:
            r7 = r1
        L31:
            r8 = 34
            if (r4 < r8) goto L3a
            r10 = r10 & 32
            if (r10 == 0) goto L3a
            r1 = r2
        L3a:
            if (r5 != 0) goto L4c
            if (r6 != 0) goto L4c
            if (r7 != 0) goto L4c
            if (r1 != 0) goto L4c
            if (r4 < r8) goto L49
            r10 = r2
            r1 = r10
        L46:
            r5 = r1
        L47:
            r6 = r5
            goto L52
        L49:
            r10 = r1
            r1 = r2
            goto L46
        L4c:
            r10 = r1
            r1 = r7
            goto L52
        L4f:
            r10 = r1
            r5 = r2
            goto L47
        L52:
            r9.a = r5
            r9.b = r6
            r9.c = r1
            r9.d = r10
            if (r0 == 0) goto L71
            android.view.inputmethod.CursorAnchorInfo r10 = r9.a()
            if (r10 == 0) goto L71
            java.lang.Object r0 = r9.g
            eb1 r0 = (defpackage.eb1) r0
            android.view.inputmethod.InputMethodManager r1 = r0.g()
            java.lang.Object r0 = r0.a
            android.view.View r0 = (android.view.View) r0
            r1.updateCursorAnchorInfo(r0, r10)
        L71:
            java.lang.Object r10 = r9.i
            fkg r10 = (defpackage.fkg) r10
            r0 = 0
            if (r3 == 0) goto L94
            if (r10 == 0) goto L81
            boolean r10 = r10.c()
            if (r10 != r2) goto L81
            return r2
        L81:
            java.lang.Object r10 = r9.h
            l45 r10 = (defpackage.l45) r10
            fj r1 = new fj
            r3 = 4
            r1.<init>(r9, r0, r3)
            o45 r3 = defpackage.o45.H
            fkg r10 = defpackage.gb9.D(r10, r0, r3, r1, r2)
            r9.i = r10
            return r2
        L94:
            if (r10 == 0) goto L99
            r10.d(r0)
        L99:
            r9.i = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omg.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        rc4 rc4Var = (rc4) ((eb1) this.a.H);
        rc4Var.g().dispatchKeyEventFromInputMethod((View) rc4Var.a, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        vuk.m(this.a, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        vuk.n(this.a, string, i, spanned != null ? x2k.j(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        p60 p60Var = this.a;
        vuk.o(p60Var, i, i2);
        ((bz7) p60Var.J).invoke(Boolean.FALSE);
        return true;
    }
}
