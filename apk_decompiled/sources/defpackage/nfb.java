package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.MessageComposeV1Input;
import com.anthropic.claude.tool.model.TaskProposeInput;
import com.anthropic.claude.tool.model.TaskProposeOutput;

/* JADX INFO: loaded from: classes.dex */
public final class nfb extends dxh {
    public final /* synthetic */ int e = 1;
    public final String f;
    public final String g;
    public final dwh h;
    public final Object i;

    public nfb(String str, kah kahVar, mwh mwhVar) {
        super(mwhVar, TaskProposeInput.Companion.serializer(), TaskProposeOutput.Companion.serializer());
        this.f = str;
        this.i = kahVar;
        this.g = hxh.v;
        this.h = new dwh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c5  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [com.anthropic.claude.types.strings.TaskId] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r23v3, types: [zy7] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [pz7] */
    /* JADX WARN: Type inference failed for: r24v3 */
    @Override // defpackage.dxh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final java.lang.String r38, final java.lang.String r39, final boolean r40, final defpackage.dlb r41, final defpackage.lvh r42, final boolean r43, final boolean r44, final defpackage.iqb r45, defpackage.ld4 r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfb.c(java.lang.String, java.lang.String, boolean, dlb, lvh, boolean, boolean, iqb, ld4, int):void");
    }

    @Override // defpackage.dxh
    public final fwh n() {
        switch (this.e) {
        }
        return this.h;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        switch (this.e) {
        }
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        switch (this.e) {
            case 0:
                ud0 ud0Var = ud0.d;
                ud0 ud0Var2 = ud0.d;
                return R.drawable.anthropicon_chat;
            default:
                ud0 ud0Var3 = ud0.d;
                ud0 ud0Var4 = ud0.d;
                return R.drawable.anthropicon_checklist;
        }
    }

    @Override // defpackage.dxh
    public final String r() {
        switch (this.e) {
        }
        return this.g;
    }

    @Override // defpackage.dxh
    public final String s() {
        switch (this.e) {
        }
        return this.f;
    }

    public nfb(String str, mwh mwhVar, ie5 ie5Var) {
        super(mwhVar, MessageComposeV1Input.Companion.serializer(), kei.b);
        this.f = str;
        this.i = ie5Var;
        this.g = hxh.f;
        this.h = new dwh();
    }
}
