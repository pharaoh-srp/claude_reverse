package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionActioned;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionAction;
import com.anthropic.claude.tool.model.SearchMcpRegistryInput;
import com.anthropic.claude.tool.model.SearchMcpRegistryOutput;
import com.anthropic.claude.tool.model.SuggestConnectorsInput;
import com.anthropic.claude.tool.model.SuggestConnectorsOutput;

/* JADX INFO: loaded from: classes.dex */
public final class ief extends dxh {
    public final /* synthetic */ int e;
    public final String f;
    public final qi3 g;
    public final String h;
    public final dwh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ief(mwh mwhVar, String str, qi3 qi3Var, int i) {
        super(mwhVar, SearchMcpRegistryInput.Companion.serializer(), SearchMcpRegistryOutput.Companion.serializer());
        this.e = i;
        switch (i) {
            case 1:
                super(mwhVar, SuggestConnectorsInput.Companion.serializer(), SuggestConnectorsOutput.Companion.serializer());
                this.f = str;
                this.g = qi3Var;
                this.h = hxh.C;
                this.i = new dwh();
                break;
            default:
                this.f = str;
                this.g = qi3Var;
                this.h = hxh.B;
                this.i = new dwh();
                break;
        }
    }

    public static final void x(ief iefVar, String str, String str2, McpEvents$SuggestionAction mcpEvents$SuggestionAction, String str3) {
        iefVar.g.e(new McpEvents$McpSuggestionActioned(str, str2, mcpEvents$SuggestionAction, str3), McpEvents$McpSuggestionActioned.Companion.serializer());
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    @Override // defpackage.dxh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final java.lang.String r28, final java.lang.String r29, final boolean r30, final defpackage.dlb r31, final defpackage.lvh r32, final boolean r33, final boolean r34, final defpackage.iqb r35, defpackage.ld4 r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ief.c(java.lang.String, java.lang.String, boolean, dlb, lvh, boolean, boolean, iqb, ld4, int):void");
    }

    @Override // defpackage.dxh
    public final fwh n() {
        switch (this.e) {
        }
        return this.i;
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
                break;
            default:
                ud0 ud0Var3 = ud0.d;
                ud0 ud0Var4 = ud0.d;
                break;
        }
        return R.drawable.anthropicon_connector;
    }

    @Override // defpackage.dxh
    public final String r() {
        switch (this.e) {
        }
        return this.h;
    }

    @Override // defpackage.dxh
    public final String s() {
        switch (this.e) {
        }
        return this.f;
    }
}
