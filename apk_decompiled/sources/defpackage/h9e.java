package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h9e implements InputConnection {
    public final ro6 a;
    public final boolean b;
    public final m2a c;
    public final zhh d;
    public final ovi e;
    public int f;
    public cjh g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public h9e(cjh cjhVar, ro6 ro6Var, boolean z, m2a m2aVar, zhh zhhVar, ovi oviVar) {
        this.a = ro6Var;
        this.b = z;
        this.c = m2aVar;
        this.d = zhhVar;
        this.e = oviVar;
        this.g = cjhVar;
    }

    public final void a(ij6 ij6Var) {
        this.f++;
        try {
            this.j.add(ij6Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((n2a) this.a.F).G.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((n2a) this.a.F).N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (x44.r(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new n74(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new ry5(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new sy5(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new jl7());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        cjh cjhVar = this.g;
        return TextUtils.getCapsMode(cjhVar.a.F, kkh.g(cjhVar.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return mkk.f(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (kkh.d(this.g.b)) {
            return null;
        }
        return dpk.g(this.g).F;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return dpk.h(this.g, i).F;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return dpk.i(this.g, i).F;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new wwf(0, this.g.a.F.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                ((n2a) this.a.F).H.invoke(new ty8(i2));
            } else {
                i2 = 1;
                ((n2a) this.a.F).H.invoke(new ty8(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        zb0 zb0Var;
        int i;
        zjh zjhVarD;
        zjh zjhVarD2;
        if (Build.VERSION.SDK_INT >= 34) {
            d6d d6dVar = new d6d(6, this);
            m2a m2aVar = this.c;
            int iF = 3;
            if (m2aVar != null && (zb0Var = m2aVar.j) != null) {
                zjh zjhVarD3 = m2aVar.d();
                if (zb0Var.equals(zjhVarD3 != null ? zjhVarD3.a.a.a : null)) {
                    boolean z = fa5.z(handwritingGesture);
                    zhh zhhVar = this.d;
                    if (z) {
                        SelectGesture selectGestureS = fa5.s(handwritingGesture);
                        long jO = zrk.o(m2aVar, mwa.T(selectGestureS.getSelectionArea()), selectGestureS.getGranularity() != 1 ? 0 : 1);
                        if (kkh.d(jO)) {
                            iF = yrk.f(df8.q(selectGestureS), d6dVar);
                        } else {
                            d6dVar.invoke(new wwf((int) (jO >> 32), (int) (jO & 4294967295L)));
                            if (zhhVar != null) {
                                zhhVar.m(true);
                            }
                            iF = 1;
                        }
                    } else if (df8.x(handwritingGesture)) {
                        DeleteGesture deleteGestureO = df8.o(handwritingGesture);
                        int i2 = deleteGestureO.getGranularity() != 1 ? 0 : 1;
                        long jO2 = zrk.o(m2aVar, mwa.T(deleteGestureO.getDeletionArea()), i2);
                        if (kkh.d(jO2)) {
                            iF = yrk.f(df8.q(deleteGestureO), d6dVar);
                        } else {
                            yrk.i(jO2, zb0Var, i2 == 1, d6dVar);
                            iF = 1;
                        }
                    } else if (df8.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureS = df8.s(handwritingGesture);
                        long jD = zrk.d(m2aVar, mwa.T(selectRangeGestureS.getSelectionStartArea()), mwa.T(selectRangeGestureS.getSelectionEndArea()), selectRangeGestureS.getGranularity() != 1 ? 0 : 1);
                        if (kkh.d(jD)) {
                            iF = yrk.f(df8.q(selectRangeGestureS), d6dVar);
                        } else {
                            d6dVar.invoke(new wwf((int) (jD >> 32), (int) (jD & 4294967295L)));
                            if (zhhVar != null) {
                                zhhVar.m(true);
                            }
                            iF = 1;
                        }
                    } else if (df8.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureP = df8.p(handwritingGesture);
                        int i3 = deleteRangeGestureP.getGranularity() != 1 ? 0 : 1;
                        long jD2 = zrk.d(m2aVar, mwa.T(deleteRangeGestureP.getDeletionStartArea()), mwa.T(deleteRangeGestureP.getDeletionEndArea()), i3);
                        if (kkh.d(jD2)) {
                            iF = yrk.f(df8.q(deleteRangeGestureP), d6dVar);
                        } else {
                            yrk.i(jD2, zb0Var, i3 == 1, d6dVar);
                            iF = 1;
                        }
                    } else {
                        boolean zD = fa5.D(handwritingGesture);
                        ovi oviVar = this.e;
                        if (zD) {
                            JoinOrSplitGesture joinOrSplitGestureR = df8.r(handwritingGesture);
                            if (oviVar == null) {
                                iF = yrk.f(df8.A(joinOrSplitGestureR), d6dVar);
                            } else {
                                long jH = zrk.h(joinOrSplitGestureR.getJoinOrSplitPoint());
                                zjh zjhVarD4 = m2aVar.d();
                                int iN = zjhVarD4 != null ? zrk.n(zjhVarD4.a.b, jH, m2aVar.c(), oviVar) : -1;
                                if (iN == -1 || ((zjhVarD2 = m2aVar.d()) != null && zrk.f(zjhVarD2.a, iN))) {
                                    iF = yrk.f(df8.q(joinOrSplitGestureR), d6dVar);
                                } else {
                                    long jG = zrk.g(iN, zb0Var);
                                    if (kkh.d(jG)) {
                                        int i4 = (int) (jG >> 32);
                                        d6dVar.invoke(new ff8(new ij6[]{new wwf(i4, i4), new n74(" ", 1)}));
                                    } else {
                                        yrk.i(jG, zb0Var, false, d6dVar);
                                    }
                                    iF = 1;
                                }
                            }
                        } else if (fa5.B(handwritingGesture)) {
                            InsertGesture insertGestureQ = fa5.q(handwritingGesture);
                            if (oviVar == null) {
                                iF = yrk.f(df8.A(insertGestureQ), d6dVar);
                            } else {
                                long jH2 = zrk.h(insertGestureQ.getInsertionPoint());
                                zjh zjhVarD5 = m2aVar.d();
                                int iN2 = zjhVarD5 != null ? zrk.n(zjhVarD5.a.b, jH2, m2aVar.c(), oviVar) : -1;
                                if (iN2 == -1 || ((zjhVarD = m2aVar.d()) != null && zrk.f(zjhVarD.a, iN2))) {
                                    iF = yrk.f(df8.q(insertGestureQ), d6dVar);
                                } else {
                                    d6dVar.invoke(new ff8(new ij6[]{new wwf(iN2, iN2), new n74(insertGestureQ.getTextToInsert(), 1)}));
                                    iF = 1;
                                }
                            }
                        } else if (fa5.C(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureR = fa5.r(handwritingGesture);
                            zjh zjhVarD6 = m2aVar.d();
                            long jC = zrk.c(zjhVarD6 != null ? zjhVarD6.a : null, zrk.h(removeSpaceGestureR.getStartPoint()), zrk.h(removeSpaceGestureR.getEndPoint()), m2aVar.c(), oviVar);
                            if (kkh.d(jC)) {
                                iF = yrk.f(df8.q(removeSpaceGestureR), d6dVar);
                            } else {
                                bae baeVar = new bae();
                                baeVar.E = -1;
                                bae baeVar2 = new bae();
                                baeVar2.E = -1;
                                String strG = new ide("\\s+").g(mwa.O(jC, zb0Var), new ef8(baeVar, baeVar2, 0));
                                int i5 = baeVar.E;
                                if (i5 == -1 || (i = baeVar2.E) == -1) {
                                    iF = yrk.f(df8.q(removeSpaceGestureR), d6dVar);
                                } else {
                                    int i6 = (int) (jC >> 32);
                                    d6dVar.invoke(new ff8(new ij6[]{new wwf(i6 + i5, i6 + i), new n74(strG.substring(i5, strG.length() - (kkh.e(jC) - baeVar2.E)), 1)}));
                                    iF = 1;
                                }
                            }
                        } else {
                            iF = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new qe0(intConsumer, iF, 0));
            } else {
                intConsumer.accept(iF);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        m2a m2aVar;
        zb0 zb0Var;
        if (Build.VERSION.SDK_INT >= 34 && (m2aVar = this.c) != null && (zb0Var = m2aVar.j) != null) {
            zjh zjhVarD = m2aVar.d();
            if (zb0Var.equals(zjhVarD != null ? zjhVarD.a.a.a : null)) {
                boolean z = fa5.z(previewableHandwritingGesture);
                int i = 1;
                we8 we8Var = we8.E;
                zhh zhhVar = this.d;
                if (z) {
                    SelectGesture selectGestureS = fa5.s(previewableHandwritingGesture);
                    if (zhhVar != null) {
                        long jO = zrk.o(m2aVar, mwa.T(selectGestureS.getSelectionArea()), selectGestureS.getGranularity() != 1 ? 0 : 1);
                        m2a m2aVar2 = zhhVar.d;
                        if (m2aVar2 != null) {
                            m2aVar2.f(jO);
                        }
                        m2a m2aVar3 = zhhVar.d;
                        if (m2aVar3 != null) {
                            m2aVar3.e(kkh.b);
                        }
                        if (!kkh.d(jO)) {
                            zhhVar.A(false);
                            zhhVar.x(we8Var);
                        }
                    }
                } else if (df8.x(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureO = df8.o(previewableHandwritingGesture);
                    if (zhhVar != null) {
                        long jO2 = zrk.o(m2aVar, mwa.T(deleteGestureO.getDeletionArea()), deleteGestureO.getGranularity() != 1 ? 0 : 1);
                        m2a m2aVar4 = zhhVar.d;
                        if (m2aVar4 != null) {
                            m2aVar4.e(jO2);
                        }
                        m2a m2aVar5 = zhhVar.d;
                        if (m2aVar5 != null) {
                            m2aVar5.f(kkh.b);
                        }
                        if (!kkh.d(jO2)) {
                            zhhVar.A(false);
                            zhhVar.x(we8Var);
                        }
                    }
                } else if (df8.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureS = df8.s(previewableHandwritingGesture);
                    if (zhhVar != null) {
                        long jD = zrk.d(m2aVar, mwa.T(selectRangeGestureS.getSelectionStartArea()), mwa.T(selectRangeGestureS.getSelectionEndArea()), selectRangeGestureS.getGranularity() != 1 ? 0 : 1);
                        m2a m2aVar6 = zhhVar.d;
                        if (m2aVar6 != null) {
                            m2aVar6.f(jD);
                        }
                        m2a m2aVar7 = zhhVar.d;
                        if (m2aVar7 != null) {
                            m2aVar7.e(kkh.b);
                        }
                        if (!kkh.d(jD)) {
                            zhhVar.A(false);
                            zhhVar.x(we8Var);
                        }
                    }
                } else if (df8.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureP = df8.p(previewableHandwritingGesture);
                    if (zhhVar != null) {
                        long jD2 = zrk.d(m2aVar, mwa.T(deleteRangeGestureP.getDeletionStartArea()), mwa.T(deleteRangeGestureP.getDeletionEndArea()), deleteRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        m2a m2aVar8 = zhhVar.d;
                        if (m2aVar8 != null) {
                            m2aVar8.e(jD2);
                        }
                        m2a m2aVar9 = zhhVar.d;
                        if (m2aVar9 != null) {
                            m2aVar9.f(kkh.b);
                        }
                        if (!kkh.d(jD2)) {
                            zhhVar.A(false);
                            zhhVar.x(we8Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new zc4(i, zhhVar));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            ro6 r9 = r9.a
            java.lang.Object r9 = r9.F
            n2a r9 = (defpackage.n2a) r9
            f2a r9 = r9.Q
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            cjh r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9e.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((n2a) this.a.F).O.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new qwf(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new rwf(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new wwf(i, i2));
        return true;
    }
}
