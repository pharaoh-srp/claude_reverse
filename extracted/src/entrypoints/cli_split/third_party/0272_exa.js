  var exa = __commonJS((OQy, ZRa) => {
    function skp(e) {
      let t = e.regex;
      let n = ["lcase", "month", "vartype", "instrrev", "ubound", "setlocale", "getobject", "rgb", "getref", "string", "weekdayname", "rnd", "dateadd", "monthname", "now", "day", "minute", "isarray", "cbool", "round", "formatcurrency", "conversions", "csng", "timevalue", "second", "year", "space", "abs", "clng", "timeserial", "fixs", "len", "asc", "isempty", "maths", "dateserial", "atn", "timer", "isobject", "filter", "weekday", "datevalue", "ccur", "isdate", "instr", "datediff", "formatdatetime", "replace", "isnull", "right", "sgn", "array", "snumeric", "log", "cdbl", "hex", "chr", "lbound", "msgbox", "ucase", "getlocale", "cos", "cdate", "cbyte", "rtrim", "join", "hour", "oct", "typename", "trim", "strcomp", "int", "createobject", "loadpicture", "tan", "formatnumber", "mid", "split", "cint", "sin", "datepart", "ltrim", "sqr", "time", "derived", "eval", "date", "formatpercent", "exp", "inputbox", "left", "ascw", "chrw", "regexp", "cstr", "err"];
      let r = ["server", "response", "request", "scriptengine", "scriptenginebuildversion", "scriptengineminorversion", "scriptenginemajorversion"];
      let o = {
        begin: t.concat(t.either(...n), "\\s*\\("),
        relevance: 0,
        keywords: {
          built_in: n
        }
      };
      return {
        name: "VBScript",
        aliases: ["vbs"],
        case_insensitive: true,
        keywords: {
          keyword: ["call", "class", "const", "dim", "do", "loop", "erase", "execute", "executeglobal", "exit", "for", "each", "next", "function", "if", "then", "else", "on", "error", "option", "explicit", "new", "private", "property", "let", "get", "public", "randomize", "redim", "rem", "select", "case", "set", "stop", "sub", "while", "wend", "with", "end", "to", "elseif", "is", "or", "xor", "and", "not", "class_initialize", "class_terminate", "default", "preserve", "in", "me", "byval", "byref", "step", "resume", "goto"],
          built_in: r,
          literal: ["true", "false", "null", "nothing", "empty"]
        },
        illegal: "//",
        contains: [o, e.inherit(e.QUOTE_STRING_MODE, {
          contains: [{
            begin: '""'
          }]
        }), e.COMMENT(/'/, /$/, {
          relevance: 0
        }), e.C_NUMBER_MODE]
      };
    }
    ZRa.exports = skp;
  });
  var nxa = __commonJS((DQy, txa) => {
    function ikp(e) {
      return {
        name: "VBScript in HTML",
        subLanguage: "xml",
        contains: [{
          begin: "<%",
          end: "%>",
          subLanguage: "vbscript"
        }]
      };
    }
    txa.exports = ikp;
  });
  var oxa = __commonJS((MQy, rxa) => {
    function akp(e) {
      let t = e.regex;
      let n = {
        $pattern: /\$?[\w]+(\$[\w]+)*/,
        keyword: ["accept_on", "alias", "always", "always_comb", "always_ff", "always_latch", "and", "assert", "assign", "assume", "automatic", "before", "begin", "bind", "bins", "binsof", "bit", "break", "buf|0", "bufif0", "bufif1", "byte", "case", "casex", "casez", "cell", "chandle", "checker", "class", "clocking", "cmos", "config", "const", "constraint", "context", "continue", "cover", "covergroup", "coverpoint", "cross", "deassign", "default", "defparam", "design", "disable", "dist", "do", "edge", "else", "end", "endcase", "endchecker", "endclass", "endclocking", "endconfig", "endfunction", "endgenerate", "endgroup", "endinterface", "endmodule", "endpackage", "endprimitive", "endprogram", "endproperty", "endspecify", "endsequence", "endtable", "endtask", "enum", "event", "eventually", "expect", "export", "extends", "extern", "final", "first_match", "for", "force", "foreach", "forever", "fork", "forkjoin", "function", "generate|5", "genvar", "global", "highz0", "highz1", "if", "iff", "ifnone", "ignore_bins", "illegal_bins", "implements", "implies", "import", "incdir", "include", "initial", "inout", "input", "inside", "instance", "int", "integer", "interconnect", "interface", "intersect", "join", "join_any", "join_none", "large", "let", "liblist", "library", "local", "localparam", "logic", "longint", "macromodule", "matches", "medium", "modport", "module", "nand", "negedge", "nettype", "new", "nexttime", "nmos", "nor", "noshowcancelled", "not", "notif0", "notif1", "or", "output", "package", "packed", "parameter", "pmos", "posedge", "primitive", "priority", "program", "property", "protected", "pull0", "pull1", "pulldown", "pullup", "pulsestyle_ondetect", "pulsestyle_onevent", "pure", "rand", "randc", "randcase", "randsequence", "rcmos", "real", "realtime", "ref", "reg", "reject_on", "release", "repeat", "restrict", "return", "rnmos", "rpmos", "rtran", "rtranif0", "rtranif1", "s_always", "s_eventually", "s_nexttime", "s_until", "s_until_with", "scalared", "sequence", "shortint", "shortreal", "showcancelled", "signed", "small", "soft", "solve", "specify", "specparam", "static", "string", "strong", "strong0", "strong1", "struct", "super", "supply0", "supply1", "sync_accept_on", "sync_reject_on", "table", "tagged", "task", "this", "throughout", "time", "timeprecision", "timeunit", "tran", "tranif0", "tranif1", "tri", "tri0", "tri1", "triand", "trior", "trireg", "type", "typedef", "union", "unique", "unique0", "unsigned", "until", "until_with", "untyped", "use", "uwire", "var", "vectored", "virtual", "void", "wait", "wait_order", "wand", "weak", "weak0", "weak1", "while", "wildcard", "wire", "with", "within", "wor", "xnor", "xor"],
        literal: ["null"],
        built_in: ["$finish", "$stop", "$exit", "$fatal", "$error", "$warning", "$info", "$realtime", "$time", "$printtimescale", "$bitstoreal", "$bitstoshortreal", "$itor", "$signed", "$cast", "$bits", "$stime", "$timeformat", "$realtobits", "$shortrealtobits", "$rtoi", "$unsigned", "$asserton", "$assertkill", "$assertpasson", "$assertfailon", "$assertnonvacuouson", "$assertoff", "$assertcontrol", "$assertpassoff", "$assertfailoff", "$assertvacuousoff", "$isunbounded", "$sampled", "$fell", "$changed", "$past_gclk", "$fell_gclk", "$changed_gclk", "$rising_gclk", "$steady_gclk", "$coverage_control", "$coverage_get", "$coverage_save", "$set_coverage_db_name", "$rose", "$stable", "$past", "$rose_gclk", "$stable_gclk", "$future_gclk", "$falling_gclk", "$changing_gclk", "$display", "$coverage_get_max", "$coverage_merge", "$get_coverage", "$load_coverage_db", "$typename", "$unpacked_dimensions", "$left", "$low", "$increment", "$clog2", "$ln", "$log10", "$exp", "$sqrt", "$pow", "$floor", "$ceil", "$sin", "$cos", "$tan", "$countbits", "$onehot", "$isunknown", "$fatal", "$warning", "$dimensions", "$right", "$high", "$size", "$asin", "$acos", "$atan", "$atan2", "$hypot", "$sinh", "$cosh", "$tanh", "$asinh", "$acosh", "$atanh", "$countones", "$onehot0", "$error", "$info", "$random", "$dist_chi_square", "$dist_erlang", "$dist_exponential", "$dist_normal", "$dist_poisson", "$dist_t", "$dist_uniform", "$q_initialize", "$q_remove", "$q_exam", "$async$and$array", "$async$nand$array", "$async$or$array", "$async$nor$array", "$sync$and$array", "$sync$nand$array", "$sync$or$array", "$sync$nor$array", "$q_add", "$q_full", "$psprintf", "$async$and$plane", "$async$nand$plane", "$async$or$plane", "$async$nor$plane", "$sync$and$plane", "$sync$nand$plane", "$sync$or$plane", "$sync$nor$plane", "$system", "$display", "$displayb", "$displayh", "$displayo", "$strobe", "$strobeb", "$strobeh", "$strobeo", "$write", "$readmemb", "$readmemh", "$writememh", "$value$plusargs", "$dumpvars", "$dumpon", "$dumplimit", "$dumpports", "$dumpportson", "$dumpportslimit", "$writeb", "$writeh", "$writeo", "$monitor", "$monitorb", "$monitorh", "$monitoro", "$writememb", "$dumpfile", "$dumpoff", "$dumpall", "$dumpflush", "$dumpportsoff", "$dumpportsall", "$dumpportsflush", "$fclose", "$fdisplay", "$fdisplayb", "$fdisplayh", "$fdisplayo", "$fstrobe", "$fstrobeb", "$fstrobeh", "$fstrobeo", "$swrite", "$swriteb", "$swriteh", "$swriteo", "$fscanf", "$fread", "$fseek", "$fflush", "$feof", "$fopen", "$fwrite", "$fwriteb", "$fwriteh", "$fwriteo", "$fmonitor", "$fmonitorb", "$fmonitorh", "$fmonitoro", "$sformat", "$sformatf", "$fgetc", "$ungetc", "$fgets", "$sscanf", "$rewind", "$ftell", "$ferror"]
      };
      let r = ["__FILE__", "__LINE__"];
      let o = ["begin_keywords", "celldefine", "default_nettype", "default_decay_time", "default_trireg_strength", "define", "delay_mode_distributed", "delay_mode_path", "delay_mode_unit", "delay_mode_zero", "else", "elsif", "end_keywords", "endcelldefine", "endif", "ifdef", "ifndef", "include", "line", "nounconnected_drive", "pragma", "resetall", "timescale", "unconnected_drive", "undef", "undefineall"];
      return {
        name: "Verilog",
        aliases: ["v", "sv", "svh"],
        case_insensitive: false,
        keywords: n,
        contains: [e.C_BLOCK_COMMENT_MODE, e.C_LINE_COMMENT_MODE, e.QUOTE_STRING_MODE, {
          scope: "number",
          contains: [e.BACKSLASH_ESCAPE],
          variants: [{
            begin: /\b((\d+'([bhodBHOD]))[0-9xzXZa-fA-F_]+)/
          }, {
            begin: /\B(('([bhodBHOD]))[0-9xzXZa-fA-F_]+)/
          }, {
            begin: /\b[0-9][0-9_]*/,
            relevance: 0
          }]
        }, {
          scope: "variable",
          variants: [{
            begin: "#\\((?!parameter).+\\)"
          }, {
            begin: "\\.\\w+",
            relevance: 0
          }]
        }, {
          scope: "variable.constant",
          match: t.concat(/`/, t.either(...r))
        }, {
          scope: "meta",
          begin: t.concat(/`/, t.either(...o)),
          end: /$|\/\/|\/\*/,
          returnEnd: true,
          keywords: o
        }]
      };
    }
    rxa.exports = akp;
  });
  var ixa = __commonJS((NQy, sxa) => {
    function lkp(e) {
      let n = "[eE][-+]?\\d(_|\\d)*";
      let r = "\\d(_|\\d)*(\\.\\d(_|\\d)*)?(" + n + ")?";
      let o = "\\w+";
      let i = "\\b(" + ("\\d(_|\\d)*#\\w+(\\.\\w+)?#(" + n + ")?") + "|" + r + ")";
      return {
        name: "VHDL",
        case_insensitive: true,
        keywords: {
          keyword: ["abs", "access", "after", "alias", "all", "and", "architecture", "array", "assert", "assume", "assume_guarantee", "attribute", "begin", "block", "body", "buffer", "bus", "case", "component", "configuration", "constant", "context", "cover", "disconnect", "downto", "default", "else", "elsif", "end", "entity", "exit", "fairness", "file", "for", "force", "function", "generate", "generic", "group", "guarded", "if", "impure", "in", "inertial", "inout", "is", "label", "library", "linkage", "literal", "loop", "map", "mod", "nand", "new", "next", "nor", "not", "null", "of", "on", "open", "or", "others", "out", "package", "parameter", "port", "postponed", "procedure", "process", "property", "protected", "pure", "range", "record", "register", "reject", "release", "rem", "report", "restrict", "restrict_guarantee", "return", "rol", "ror", "select", "sequence", "severity", "shared", "signal", "sla", "sll", "sra", "srl", "strong", "subtype", "then", "to", "transport", "type", "unaffected", "units", "until", "use", "variable", "view", "vmode", "vprop", "vunit", "wait", "when", "while", "with", "xnor", "xor"],
          built_in: ["boolean", "bit", "character", "integer", "time", "delay_length", "natural", "positive", "string", "bit_vector", "file_open_kind", "file_open_status", "std_logic", "std_logic_vector", "unsigned", "signed", "boolean_vector", "integer_vector", "std_ulogic", "std_ulogic_vector", "unresolved_unsigned", "u_unsigned", "unresolved_signed", "u_signed", "real_vector", "time_vector"],
          literal: ["false", "true", "note", "warning", "error", "failure", "line", "text", "side", "width"]
        },
        illegal: /\{/,
        contains: [e.C_BLOCK_COMMENT_MODE, e.COMMENT("--", "$"), e.QUOTE_STRING_MODE, {
          className: "number",
          begin: i,
          relevance: 0
        }, {
          className: "string",
          begin: "'(U|X|0|1|Z|W|L|H|-)'",
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          className: "symbol",
          begin: "'[A-Za-z](_?[A-Za-z0-9])*",
          contains: [e.BACKSLASH_ESCAPE]
        }]
      };
    }
    sxa.exports = lkp;
  });
  var lxa = __commonJS((LQy, axa) => {
    function ckp(e) {
      return {
        name: "Vim Script",
        keywords: {
          $pattern: /[!#@\w]+/,
          keyword: "N|0 P|0 X|0 a|0 ab abc abo al am an|0 ar arga argd arge argdo argg argl argu as au aug aun b|0 bN ba bad bd be bel bf bl bm bn bo bp br brea breaka breakd breakl bro bufdo buffers bun bw c|0 cN cNf ca cabc caddb cad caddf cal cat cb cc ccl cd ce cex cf cfir cgetb cgete cg changes chd che checkt cl cla clo cm cmapc cme cn cnew cnf cno cnorea cnoreme co col colo com comc comp con conf cope cp cpf cq cr cs cst cu cuna cunme cw delm deb debugg delc delf dif diffg diffo diffp diffpu diffs diffthis dig di dl dell dj dli do doautoa dp dr ds dsp e|0 ea ec echoe echoh echom echon el elsei em en endfo endf endt endw ene ex exe exi exu f|0 files filet fin fina fini fir fix fo foldc foldd folddoc foldo for fu go gr grepa gu gv ha helpf helpg helpt hi hid his ia iabc if ij il im imapc ime ino inorea inoreme int is isp iu iuna iunme j|0 ju k|0 keepa kee keepj lN lNf l|0 lad laddb laddf la lan lat lb lc lch lcl lcs le lefta let lex lf lfir lgetb lgete lg lgr lgrepa lh ll lla lli lmak lm lmapc lne lnew lnf ln loadk lo loc lockv lol lope lp lpf lr ls lt lu lua luad luaf lv lvimgrepa lw m|0 ma mak map mapc marks mat me menut mes mk mks mksp mkv mkvie mod mz mzf nbc nb nbs new nm nmapc nme nn nnoreme noa no noh norea noreme norm nu nun nunme ol o|0 om omapc ome on ono onoreme opt ou ounme ow p|0 profd prof pro promptr pc ped pe perld po popu pp pre prev ps pt ptN ptf ptj ptl ptn ptp ptr pts pu pw py3 python3 py3d py3f py pyd pyf quita qa rec red redi redr redraws reg res ret retu rew ri rightb rub rubyd rubyf rund ru rv sN san sa sal sav sb sbN sba sbf sbl sbm sbn sbp sbr scrip scripte scs se setf setg setl sf sfir sh sim sig sil sl sla sm smap smapc sme sn sni sno snor snoreme sor so spelld spe spelli spellr spellu spellw sp spr sre st sta startg startr star stopi stj sts sun sunm sunme sus sv sw sy synti sync tN tabN tabc tabdo tabe tabf tabfir tabl tabm tabnew tabn tabo tabp tabr tabs tab ta tags tc tcld tclf te tf th tj tl tm tn to tp tr try ts tu u|0 undoj undol una unh unl unlo unm unme uns up ve verb vert vim vimgrepa vi viu vie vm vmapc vme vne vn vnoreme vs vu vunme windo w|0 wN wa wh wi winc winp wn wp wq wqa ws wu wv x|0 xa xmapc xm xme xn xnoreme xu xunme y|0 z|0 ~ Next Print append abbreviate abclear aboveleft all amenu anoremenu args argadd argdelete argedit argglobal arglocal argument ascii autocmd augroup aunmenu buffer bNext ball badd bdelete behave belowright bfirst blast bmodified bnext botright bprevious brewind break breakadd breakdel breaklist browse bunload bwipeout change cNext cNfile cabbrev cabclear caddbuffer caddexpr caddfile call catch cbuffer cclose center cexpr cfile cfirst cgetbuffer cgetexpr cgetfile chdir checkpath checktime clist clast close cmap cmapclear cmenu cnext cnewer cnfile cnoremap cnoreabbrev cnoremenu copy colder colorscheme command comclear compiler continue confirm copen cprevious cpfile cquit crewind cscope cstag cunmap cunabbrev cunmenu cwindow delete delmarks debug debuggreedy delcommand delfunction diffupdate diffget diffoff diffpatch diffput diffsplit digraphs display deletel djump dlist doautocmd doautoall deletep drop dsearch dsplit edit earlier echo echoerr echohl echomsg else elseif emenu endif endfor endfunction endtry endwhile enew execute exit exusage file filetype find finally finish first fixdel fold foldclose folddoopen folddoclosed foldopen function global goto grep grepadd gui gvim hardcopy help helpfind helpgrep helptags highlight hide history insert iabbrev iabclear ijump ilist imap imapclear imenu inoremap inoreabbrev inoremenu intro isearch isplit iunmap iunabbrev iunmenu join jumps keepalt keepmarks keepjumps lNext lNfile list laddexpr laddbuffer laddfile last language later lbuffer lcd lchdir lclose lcscope left leftabove lexpr lfile lfirst lgetbuffer lgetexpr lgetfile lgrep lgrepadd lhelpgrep llast llist lmake lmap lmapclear lnext lnewer lnfile lnoremap loadkeymap loadview lockmarks lockvar lolder lopen lprevious lpfile lrewind ltag lunmap luado luafile lvimgrep lvimgrepadd lwindow move mark make mapclear match menu menutranslate messages mkexrc mksession mkspell mkvimrc mkview mode mzscheme mzfile nbclose nbkey nbsart next nmap nmapclear nmenu nnoremap nnoremenu noautocmd noremap nohlsearch noreabbrev noremenu normal number nunmap nunmenu oldfiles open omap omapclear omenu only onoremap onoremenu options ounmap ounmenu ownsyntax print profdel profile promptfind promptrepl pclose pedit perl perldo pop popup ppop preserve previous psearch ptag ptNext ptfirst ptjump ptlast ptnext ptprevious ptrewind ptselect put pwd py3do py3file python pydo pyfile quit quitall qall read recover redo redir redraw redrawstatus registers resize retab return rewind right rightbelow ruby rubydo rubyfile rundo runtime rviminfo substitute sNext sandbox sargument sall saveas sbuffer sbNext sball sbfirst sblast sbmodified sbnext sbprevious sbrewind scriptnames scriptencoding scscope set setfiletype setglobal setlocal sfind sfirst shell simalt sign silent sleep slast smagic smapclear smenu snext sniff snomagic snoremap snoremenu sort source spelldump spellgood spellinfo spellrepall spellundo spellwrong split sprevious srewind stop stag startgreplace startreplace startinsert stopinsert stjump stselect sunhide sunmap sunmenu suspend sview swapname syntax syntime syncbind tNext tabNext tabclose tabedit tabfind tabfirst tablast tabmove tabnext tabonly tabprevious tabrewind tag tcl tcldo tclfile tearoff tfirst throw tjump tlast tmenu tnext topleft tprevious trewind tselect tunmenu undo undojoin undolist unabbreviate unhide unlet unlockvar unmap unmenu unsilent update vglobal version verbose vertical vimgrep vimgrepadd visual viusage view vmap vmapclear vmenu vnew vnoremap vnoremenu vsplit vunmap vunmenu write wNext wall while winsize wincmd winpos wnext wprevious wqall wsverb wundo wviminfo xit xall xmapclear xmap xmenu xnoremap xnoremenu xunmap xunmenu yank",
          built_in: "synIDtrans atan2 range matcharg did_filetype asin feedkeys xor argv complete_check add getwinposx getqflist getwinposy screencol clearmatches empty extend getcmdpos mzeval garbagecollect setreg ceil sqrt diff_hlID inputsecret get getfperm getpid filewritable shiftwidth max sinh isdirectory synID system inputrestore winline atan visualmode inputlist tabpagewinnr round getregtype mapcheck hasmapto histdel argidx findfile sha256 exists toupper getcmdline taglist string getmatches bufnr strftime winwidth bufexists strtrans tabpagebuflist setcmdpos remote_read printf setloclist getpos getline bufwinnr float2nr len getcmdtype diff_filler luaeval resolve libcallnr foldclosedend reverse filter has_key bufname str2float strlen setline getcharmod setbufvar index searchpos shellescape undofile foldclosed setqflist buflisted strchars str2nr virtcol floor remove undotree remote_expr winheight gettabwinvar reltime cursor tabpagenr finddir localtime acos getloclist search tanh matchend rename gettabvar strdisplaywidth type abs py3eval setwinvar tolower wildmenumode log10 spellsuggest bufloaded synconcealed nextnonblank server2client complete settabwinvar executable input wincol setmatches getftype hlID inputsave searchpair or screenrow line settabvar histadd deepcopy strpart remote_peek and eval getftime submatch screenchar winsaveview matchadd mkdir screenattr getfontname libcall reltimestr getfsize winnr invert pow getbufline byte2line soundfold repeat fnameescape tagfiles sin strwidth spellbadword trunc maparg log lispindent hostname setpos globpath remote_foreground getchar synIDattr fnamemodify cscope_connection stridx winbufnr indent min complete_add nr2char searchpairpos inputdialog values matchlist items hlexists strridx browsedir expand fmod pathshorten line2byte argc count getwinvar glob foldtextresult getreg foreground cosh matchdelete has char2nr simplify histget searchdecl iconv winrestcmd pumvisible writefile foldlevel haslocaldir keys cos matchstr foldtext histnr tan tempname getcwd byteidx getbufvar islocked escape eventhandler remote_send serverlist winrestview synstack pyeval prevnonblank readfile cindent filereadable changenr exp"
        },
        illegal: /;/,
        contains: [e.NUMBER_MODE, {
          className: "string",
          begin: "'",
          end: "'",
          illegal: "\\n"
        }, {
          className: "string",
          begin: /"(\\"|\n\\|[^"\n])*"/
        }, e.COMMENT('"', "$"), {
          className: "variable",
          begin: /[bwtglsav]:[\w\d_]+/
        }, {
          begin: [/\b(?:function|function!)/, /\s+/, e.IDENT_RE],
          className: {
            1: "keyword",
            3: "title"
          },
          end: "$",
          relevance: 0,
          contains: [{
            className: "params",
            begin: "\\(",
            end: "\\)"
          }]
        }, {
          className: "symbol",
          begin: /<[\w-]+>/
        }]
      };
    }
    axa.exports = ckp;
  });
  var uxa = __commonJS((FQy, cxa) => {
    function ukp(e) {
      e.regex;
      let t = e.COMMENT(/\(;/, /;\)/);
      t.contains.push("self");
      let n = e.COMMENT(/;;/, /$/);
      let r = ["anyfunc", "block", "br", "br_if", "br_table", "call", "call_indirect", "data", "drop", "elem", "else", "end", "export", "func", "global.get", "global.set", "local.get", "local.set", "local.tee", "get_global", "get_local", "global", "if", "import", "local", "loop", "memory", "memory.grow", "memory.size", "module", "mut", "nop", "offset", "param", "result", "return", "select", "set_global", "set_local", "start", "table", "tee_local", "then", "type", "unreachable"];
      let o = {
        begin: [/(?:func|call|call_indirect)/, /\s+/, /\$[^\s)]+/],
        className: {
          1: "keyword",
          3: "title.function"
        }
      };
      let s = {
        className: "variable",
        begin: /\$[\w_]+/
      };
      let i = {
        match: /(\((?!;)|\))+/,
        className: "punctuation",
        relevance: 0
      };
      let a = {
        className: "number",
        relevance: 0,
        match: /[+-]?\b(?:\d(?:_?\d)*(?:\.\d(?:_?\d)*)?(?:[eE][+-]?\d(?:_?\d)*)?|0x[\da-fA-F](?:_?[\da-fA-F])*(?:\.[\da-fA-F](?:_?[\da-fA-D])*)?(?:[pP][+-]?\d(?:_?\d)*)?)\b|\binf\b|\bnan(?::0x[\da-fA-F](?:_?[\da-fA-D])*)?\b/
      };
      let l = {
        match: /(i32|i64|f32|f64)(?!\.)/,
        className: "type"
      };
      let c = {
        className: "keyword",
        match: /\b(f32|f64|i32|i64)(?:\.(?:abs|add|and|ceil|clz|const|convert_[su]\/i(?:32|64)|copysign|ctz|demote\/f64|div(?:_[su])?|eqz?|extend_[su]\/i32|floor|ge(?:_[su])?|gt(?:_[su])?|le(?:_[su])?|load(?:(?:8|16|32)_[su])?|lt(?:_[su])?|max|min|mul|nearest|neg?|or|popcnt|promote\/f32|reinterpret\/[fi](?:32|64)|rem_[su]|rot[lr]|shl|shr_[su]|store(?:8|16|32)?|sqrt|sub|trunc(?:_[su]\/f(?:32|64))?|wrap\/i64|xor))\b/
      };
      return {
        name: "WebAssembly",
        keywords: {
          $pattern: /[\w.]+/,
          keyword: r
        },
        contains: [n, t, {
          match: [/(?:offset|align)/, /\s*/, /=/],
          className: {
            1: "keyword",
            3: "operator"
          }
        }, s, i, o, e.QUOTE_STRING_MODE, l, c, a]
      };
    }
    cxa.exports = ukp;
  });
  var pxa = __commonJS((UQy, dxa) => {
    function dkp(e) {
      let t = e.regex;
      let n = /[a-zA-Z]\w*/;
      let r = ["as", "break", "class", "construct", "continue", "else", "for", "foreign", "if", "import", "in", "is", "return", "static", "var", "while"];
      let o = ["true", "false", "null"];
      let s = ["this", "super"];
      let i = ["Bool", "Class", "Fiber", "Fn", "List", "Map", "Null", "Num", "Object", "Range", "Sequence", "String", "System"];
      let a = ["-", "~", /\*/, "%", /\.\.\./, /\.\./, /\+/, "<<", ">>", ">=", "<=", "<", ">", /\^/, /!=/, /!/, /\bis\b/, "==", "&&", "&", /\|\|/, /\|/, /\?:/, "="];
      let l = {
        relevance: 0,
        match: t.concat(/\b(?!(if|while|for|else|super)\b)/, n, /(?=\s*[({])/),
        className: "title.function"
      };
      let c = {
        match: t.concat(t.either(t.concat(/\b(?!(if|while|for|else|super)\b)/, n), t.either(...a)), /(?=\s*\([^)]+\)\s*\{)/),
        className: "title.function",
        starts: {
          contains: [{
            begin: /\(/,
            end: /\)/,
            contains: [{
              relevance: 0,
              scope: "params",
              match: n
            }]
          }]
        }
      };
      let u = {
        variants: [{
          match: [/class\s+/, n, /\s+is\s+/, n]
        }, {
          match: [/class\s+/, n]
        }],
        scope: {
          2: "title.class",
          4: "title.class.inherited"
        },
        keywords: r
      };
      let d = {
        relevance: 0,
        match: t.either(...a),
        className: "operator"
      };
      let p = {
        className: "string",
        begin: /"""/,
        end: /"""/
      };
      let m = {
        className: "property",
        begin: t.concat(/\./, t.lookahead(n)),
        end: n,
        excludeBegin: true,
        relevance: 0
      };
      let f = {
        relevance: 0,
        match: t.concat(/\b_/, n),
        scope: "variable"
      };
      let h = {
        relevance: 0,
        match: /\b[A-Z]+[a-z]+([A-Z]+[a-z]+)*/,
        scope: "title.class",
        keywords: {
          _: i
        }
      };
      let g = e.C_NUMBER_MODE;
      let y = {
        match: [n, /\s*/, /=/, /\s*/, /\(/, n, /\)\s*\{/],
        scope: {
          1: "title.function",
          3: "operator",
          6: "params"
        }
      };
      let _ = e.COMMENT(/\/\*\*/, /\*\//, {
        contains: [{
          match: /@[a-z]+/,
          scope: "doctag"
        }, "self"]
      });
      let b = {
        scope: "subst",
        begin: /%\(/,
        end: /\)/,
        contains: [g, h, l, f, d]
      };
      let S = {
        scope: "string",
        begin: /"/,
        end: /"/,
        contains: [b, {
          scope: "char.escape",
          variants: [{
            match: /\\\\|\\["0%abefnrtv]/
          }, {
            match: /\\x[0-9A-F]{2}/
          }, {
            match: /\\u[0-9A-F]{4}/
          }, {
            match: /\\U[0-9A-F]{8}/
          }]
        }]
      };
      b.contains.push(S);
      let E = [...r, ...s, ...o];
      let C = {
        relevance: 0,
        match: t.concat("\\b(?!", E.join("|"), "\\b)", /[a-zA-Z_]\w*(?:[?!]|\b)/),
        className: "variable"
      };
      return {
        name: "Wren",
        keywords: {
          keyword: r,
          "variable.language": s,
          literal: o
        },
        contains: [{
          scope: "comment",
          variants: [{
            begin: [/#!?/, /[A-Za-z_]+(?=\()/],
            beginScope: {},
            keywords: {
              literal: o
            },
            contains: [],
            end: /\)/
          }, {
            begin: [/#!?/, /[A-Za-z_]+/],
            beginScope: {},
            end: /$/
          }]
        }, g, S, p, _, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, h, u, y, c, l, d, f, m, C]
      };
    }
    dxa.exports = dkp;
  });
  var fxa = __commonJS((BQy, mxa) => {
    function pkp(e) {
      return {
        name: "Intel x86 Assembly",
        case_insensitive: true,
        keywords: {
          $pattern: "[.%]?" + e.IDENT_RE,
          keyword: "lock rep repe repz repne repnz xaquire xrelease bnd nobnd aaa aad aam aas adc add and arpl bb0_reset bb1_reset bound bsf bsr bswap bt btc btr bts call cbw cdq cdqe clc cld cli clts cmc cmp cmpsb cmpsd cmpsq cmpsw cmpxchg cmpxchg486 cmpxchg8b cmpxchg16b cpuid cpu_read cpu_write cqo cwd cwde daa das dec div dmint emms enter equ f2xm1 fabs fadd faddp fbld fbstp fchs fclex fcmovb fcmovbe fcmove fcmovnb fcmovnbe fcmovne fcmovnu fcmovu fcom fcomi fcomip fcomp fcompp fcos fdecstp fdisi fdiv fdivp fdivr fdivrp femms feni ffree ffreep fiadd ficom ficomp fidiv fidivr fild fimul fincstp finit fist fistp fisttp fisub fisubr fld fld1 fldcw fldenv fldl2e fldl2t fldlg2 fldln2 fldpi fldz fmul fmulp fnclex fndisi fneni fninit fnop fnsave fnstcw fnstenv fnstsw fpatan fprem fprem1 fptan frndint frstor fsave fscale fsetpm fsin fsincos fsqrt fst fstcw fstenv fstp fstsw fsub fsubp fsubr fsubrp ftst fucom fucomi fucomip fucomp fucompp fxam fxch fxtract fyl2x fyl2xp1 hlt ibts icebp idiv imul in inc incbin insb insd insw int int01 int1 int03 int3 into invd invpcid invlpg invlpga iret iretd iretq iretw jcxz jecxz jrcxz jmp jmpe lahf lar lds lea leave les lfence lfs lgdt lgs lidt lldt lmsw loadall loadall286 lodsb lodsd lodsq lodsw loop loope loopne loopnz loopz lsl lss ltr mfence monitor mov movd movq movsb movsd movsq movsw movsx movsxd movzx mul mwait neg nop not or out outsb outsd outsw packssdw packsswb packuswb paddb paddd paddsb paddsiw paddsw paddusb paddusw paddw pand pandn pause paveb pavgusb pcmpeqb pcmpeqd pcmpeqw pcmpgtb pcmpgtd pcmpgtw pdistib pf2id pfacc pfadd pfcmpeq pfcmpge pfcmpgt pfmax pfmin pfmul pfrcp pfrcpit1 pfrcpit2 pfrsqit1 pfrsqrt pfsub pfsubr pi2fd pmachriw pmaddwd pmagw pmulhriw pmulhrwa pmulhrwc pmulhw pmullw pmvgezb pmvlzb pmvnzb pmvzb pop popa popad popaw popf popfd popfq popfw por prefetch prefetchw pslld psllq psllw psrad psraw psrld psrlq psrlw psubb psubd psubsb psubsiw psubsw psubusb psubusw psubw punpckhbw punpckhdq punpckhwd punpcklbw punpckldq punpcklwd push pusha pushad pushaw pushf pushfd pushfq pushfw pxor rcl rcr rdshr rdmsr rdpmc rdtsc rdtscp ret retf retn rol ror rdm rsdc rsldt rsm rsts sahf sal salc sar sbb scasb scasd scasq scasw sfence sgdt shl shld shr shrd sidt sldt skinit smi smint smintold smsw stc std sti stosb stosd stosq stosw str sub svdc svldt svts swapgs syscall sysenter sysexit sysret test ud0 ud1 ud2b ud2 ud2a umov verr verw fwait wbinvd wrshr wrmsr xadd xbts xchg xlatb xlat xor cmove cmovz cmovne cmovnz cmova cmovnbe cmovae cmovnb cmovb cmovnae cmovbe cmovna cmovg cmovnle cmovge cmovnl cmovl cmovnge cmovle cmovng cmovc cmovnc cmovo cmovno cmovs cmovns cmovp cmovpe cmovnp cmovpo je jz jne jnz ja jnbe jae jnb jb jnae jbe jna jg jnle jge jnl jl jnge jle jng jc jnc jo jno js jns jpo jnp jpe jp sete setz setne setnz seta setnbe setae setnb setnc setb setnae setcset setbe setna setg setnle setge setnl setl setnge setle setng sets setns seto setno setpe setp setpo setnp addps addss andnps andps cmpeqps cmpeqss cmpleps cmpless cmpltps cmpltss cmpneqps cmpneqss cmpnleps cmpnless cmpnltps cmpnltss cmpordps cmpordss cmpunordps cmpunordss cmpps cmpss comiss cvtpi2ps cvtps2pi cvtsi2ss cvtss2si cvttps2pi cvttss2si divps divss ldmxcsr maxps maxss minps minss movaps movhps movlhps movlps movhlps movmskps movntps movss movups mulps mulss orps rcpps rcpss rsqrtps rsqrtss shufps sqrtps sqrtss stmxcsr subps subss ucomiss unpckhps unpcklps xorps fxrstor fxrstor64 fxsave fxsave64 xgetbv xsetbv xsave xsave64 xsaveopt xsaveopt64 xrstor xrstor64 prefetchnta prefetcht0 prefetcht1 prefetcht2 maskmovq movntq pavgb pavgw pextrw pinsrw pmaxsw pmaxub pminsw pminub pmovmskb pmulhuw psadbw pshufw pf2iw pfnacc pfpnacc pi2fw pswapd maskmovdqu clflush movntdq movnti movntpd movdqa movdqu movdq2q movq2dq paddq pmuludq pshufd pshufhw pshuflw pslldq psrldq psubq punpckhqdq punpcklqdq addpd addsd andnpd andpd cmpeqpd cmpeqsd cmplepd cmplesd cmpltpd cmpltsd cmpneqpd cmpneqsd cmpnlepd cmpnlesd cmpnltpd cmpnltsd cmpordpd cmpordsd cmpunordpd cmpunordsd cmppd comisd cvtdq2pd cvtdq2ps cvtpd2dq cvtpd2pi cvtpd2ps cvtpi2pd cvtps2dq cvtps2pd cvtsd2si cvtsd2ss cvtsi2sd cvtss2sd cvttpd2pi cvttpd2dq cvttps2dq cvttsd2si divpd divsd maxpd maxsd minpd minsd movapd movhpd movlpd movmskpd movupd mulpd mulsd orpd shufpd sqrtpd sqrtsd subpd subsd ucomisd unpckhpd unpcklpd xorpd addsubpd addsubps haddpd haddps hsubpd hsubps lddqu movddup movshdup movsldup clgi stgi vmcall vmclear vmfunc vmlaunch vmload vmmcall vmptrld vmptrst vmread vmresume vmrun vmsave vmwrite vmxoff vmxon invept invvpid pabsb pabsw pabsd palignr phaddw phaddd phaddsw phsubw phsubd phsubsw pmaddubsw pmulhrsw pshufb psignb psignw psignd extrq insertq movntsd movntss lzcnt blendpd blendps blendvpd blendvps dppd dpps extractps insertps movntdqa mpsadbw packusdw pblendvb pblendw pcmpeqq pextrb pextrd pextrq phminposuw pinsrb pinsrd pinsrq pmaxsb pmaxsd pmaxud pmaxuw pminsb pminsd pminud pminuw pmovsxbw pmovsxbd pmovsxbq pmovsxwd pmovsxwq pmovsxdq pmovzxbw pmovzxbd pmovzxbq pmovzxwd pmovzxwq pmovzxdq pmuldq pmulld ptest roundpd roundps roundsd roundss crc32 pcmpestri pcmpestrm pcmpistri pcmpistrm pcmpgtq popcnt getsec pfrcpv pfrsqrtv movbe aesenc aesenclast aesdec aesdeclast aesimc aeskeygenassist vaesenc vaesenclast vaesdec vaesdeclast vaesimc vaeskeygenassist vaddpd vaddps vaddsd vaddss vaddsubpd vaddsubps vandpd vandps vandnpd vandnps vblendpd vblendps vblendvpd vblendvps vbroadcastss vbroadcastsd vbroadcastf128 vcmpeq_ospd vcmpeqpd vcmplt_ospd vcmpltpd vcmple_ospd vcmplepd vcmpunord_qpd vcmpunordpd vcmpneq_uqpd vcmpneqpd vcmpnlt_uspd vcmpnltpd vcmpnle_uspd vcmpnlepd vcmpord_qpd vcmpordpd vcmpeq_uqpd vcmpnge_uspd vcmpngepd vcmpngt_uspd vcmpngtpd vcmpfalse_oqpd vcmpfalsepd vcmpneq_oqpd vcmpge_ospd vcmpgepd vcmpgt_ospd vcmpgtpd vcmptrue_uqpd vcmptruepd vcmplt_oqpd vcmple_oqpd vcmpunord_spd vcmpneq_uspd vcmpnlt_uqpd vcmpnle_uqpd vcmpord_spd vcmpeq_uspd vcmpnge_uqpd vcmpngt_uqpd vcmpfalse_ospd vcmpneq_ospd vcmpge_oqpd vcmpgt_oqpd vcmptrue_uspd vcmppd vcmpeq_osps vcmpeqps vcmplt_osps vcmpltps vcmple_osps vcmpleps vcmpunord_qps vcmpunordps vcmpneq_uqps vcmpneqps vcmpnlt_usps vcmpnltps vcmpnle_usps vcmpnleps vcmpord_qps vcmpordps vcmpeq_uqps vcmpnge_usps vcmpngeps vcmpngt_usps vcmpngtps vcmpfalse_oqps vcmpfalseps vcmpneq_oqps vcmpge_osps vcmpgeps vcmpgt_osps vcmpgtps vcmptrue_uqps vcmptrueps vcmplt_oqps vcmple_oqps vcmpunord_sps vcmpneq_usps vcmpnlt_uqps vcmpnle_uqps vcmpord_sps vcmpeq_usps vcmpnge_uqps vcmpngt_uqps vcmpfalse_osps vcmpneq_osps vcmpge_oqps vcmpgt_oqps vcmptrue_usps vcmpps vcmpeq_ossd vcmpeqsd vcmplt_ossd vcmpltsd vcmple_ossd vcmplesd vcmpunord_qsd vcmpunordsd vcmpneq_uqsd vcmpneqsd vcmpnlt_ussd vcmpnltsd vcmpnle_ussd vcmpnlesd vcmpord_qsd vcmpordsd vcmpeq_uqsd vcmpnge_ussd vcmpngesd vcmpngt_ussd vcmpngtsd vcmpfalse_oqsd vcmpfalsesd vcmpneq_oqsd vcmpge_ossd vcmpgesd vcmpgt_ossd vcmpgtsd vcmptrue_uqsd vcmptruesd vcmplt_oqsd vcmple_oqsd vcmpunord_ssd vcmpneq_ussd vcmpnlt_uqsd vcmpnle_uqsd vcmpord_ssd vcmpeq_ussd vcmpnge_uqsd vcmpngt_uqsd vcmpfalse_ossd vcmpneq_ossd vcmpge_oqsd vcmpgt_oqsd vcmptrue_ussd vcmpsd vcmpeq_osss vcmpeqss vcmplt_osss vcmpltss vcmple_osss vcmpless vcmpunord_qss vcmpunordss vcmpneq_uqss vcmpneqss vcmpnlt_usss vcmpnltss vcmpnle_usss vcmpnless vcmpord_qss vcmpordss vcmpeq_uqss vcmpnge_usss vcmpngess vcmpngt_usss vcmpngtss vcmpfalse_oqss vcmpfalsess vcmpneq_oqss vcmpge_osss vcmpgess vcmpgt_osss vcmpgtss vcmptrue_uqss vcmptruess vcmplt_oqss vcmple_oqss vcmpunord_sss vcmpneq_usss vcmpnlt_uqss vcmpnle_uqss vcmpord_sss vcmpeq_usss vcmpnge_uqss vcmpngt_uqss vcmpfalse_osss vcmpneq_osss vcmpge_oqss vcmpgt_oqss vcmptrue_usss vcmpss vcomisd vcomiss vcvtdq2pd vcvtdq2ps vcvtpd2dq vcvtpd2ps vcvtps2dq vcvtps2pd vcvtsd2si vcvtsd2ss vcvtsi2sd vcvtsi2ss vcvtss2sd vcvtss2si vcvttpd2dq vcvttps2dq vcvttsd2si vcvttss2si vdivpd vdivps vdivsd vdivss vdppd vdpps vextractf128 vextractps vhaddpd vhaddps vhsubpd vhsubps vinsertf128 vinsertps vlddqu vldqqu vldmxcsr vmaskmovdqu vmaskmovps vmaskmovpd vmaxpd vmaxps vmaxsd vmaxss vminpd vminps vminsd vminss vmovapd vmovaps vmovd vmovq vmovddup vmovdqa vmovqqa vmovdqu vmovqqu vmovhlps vmovhpd vmovhps vmovlhps vmovlpd vmovlps vmovmskpd vmovmskps vmovntdq vmovntqq vmovntdqa vmovntpd vmovntps vmovsd vmovshdup vmovsldup vmovss vmovupd vmovups vmpsadbw vmulpd vmulps vmulsd vmulss vorpd vorps vpabsb vpabsw vpabsd vpacksswb vpackssdw vpackuswb vpackusdw vpaddb vpaddw vpaddd vpaddq vpaddsb vpaddsw vpaddusb vpaddusw vpalignr vpand vpandn vpavgb vpavgw vpblendvb vpblendw vpcmpestri vpcmpestrm vpcmpistri vpcmpistrm vpcmpeqb vpcmpeqw vpcmpeqd vpcmpeqq vpcmpgtb vpcmpgtw vpcmpgtd vpcmpgtq vpermilpd vpermilps vperm2f128 vpextrb vpextrw vpextrd vpextrq vphaddw vphaddd vphaddsw vphminposuw vphsubw vphsubd vphsubsw vpinsrb vpinsrw vpinsrd vpinsrq vpmaddwd vpmaddubsw vpmaxsb vpmaxsw vpmaxsd vpmaxub vpmaxuw vpmaxud vpminsb vpminsw vpminsd vpminub vpminuw vpminud vpmovmskb vpmovsxbw vpmovsxbd vpmovsxbq vpmovsxwd vpmovsxwq vpmovsxdq vpmovzxbw vpmovzxbd vpmovzxbq vpmovzxwd vpmovzxwq vpmovzxdq vpmulhuw vpmulhrsw vpmulhw vpmullw vpmulld vpmuludq vpmuldq vpor vpsadbw vpshufb vpshufd vpshufhw vpshuflw vpsignb vpsignw vpsignd vpslldq vpsrldq vpsllw vpslld vpsllq vpsraw vpsrad vpsrlw vpsrld vpsrlq vptest vpsubb vpsubw vpsubd vpsubq vpsubsb vpsubsw vpsubusb vpsubusw vpunpckhbw vpunpckhwd vpunpckhdq vpunpckhqdq vpunpcklbw vpunpcklwd vpunpckldq vpunpcklqdq vpxor vrcpps vrcpss vrsqrtps vrsqrtss vroundpd vroundps vroundsd vroundss vshufpd vshufps vsqrtpd vsqrtps vsqrtsd vsqrtss vstmxcsr vsubpd vsubps vsubsd vsubss vtestps vtestpd vucomisd vucomiss vunpckhpd vunpckhps vunpcklpd vunpcklps vxorpd vxorps vzeroall vzeroupper pclmullqlqdq pclmulhqlqdq pclmullqhqdq pclmulhqhqdq pclmulqdq vpclmullqlqdq vpclmulhqlqdq vpclmullqhqdq vpclmulhqhqdq vpclmulqdq vfmadd132ps vfmadd132pd vfmadd312ps vfmadd312pd vfmadd213ps vfmadd213pd vfmadd123ps vfmadd123pd vfmadd231ps vfmadd231pd vfmadd321ps vfmadd321pd vfmaddsub132ps vfmaddsub132pd vfmaddsub312ps vfmaddsub312pd vfmaddsub213ps vfmaddsub213pd vfmaddsub123ps vfmaddsub123pd vfmaddsub231ps vfmaddsub231pd vfmaddsub321ps vfmaddsub321pd vfmsub132ps vfmsub132pd vfmsub312ps vfmsub312pd vfmsub213ps vfmsub213pd vfmsub123ps vfmsub123pd vfmsub231ps vfmsub231pd vfmsub321ps vfmsub321pd vfmsubadd132ps vfmsubadd132pd vfmsubadd312ps vfmsubadd312pd vfmsubadd213ps vfmsubadd213pd vfmsubadd123ps vfmsubadd123pd vfmsubadd231ps vfmsubadd231pd vfmsubadd321ps vfmsubadd321pd vfnmadd132ps vfnmadd132pd vfnmadd312ps vfnmadd312pd vfnmadd213ps vfnmadd213pd vfnmadd123ps vfnmadd123pd vfnmadd231ps vfnmadd231pd vfnmadd321ps vfnmadd321pd vfnmsub132ps vfnmsub132pd vfnmsub312ps vfnmsub312pd vfnmsub213ps vfnmsub213pd vfnmsub123ps vfnmsub123pd vfnmsub231ps vfnmsub231pd vfnmsub321ps vfnmsub321pd vfmadd132ss vfmadd132sd vfmadd312ss vfmadd312sd vfmadd213ss vfmadd213sd vfmadd123ss vfmadd123sd vfmadd231ss vfmadd231sd vfmadd321ss vfmadd321sd vfmsub132ss vfmsub132sd vfmsub312ss vfmsub312sd vfmsub213ss vfmsub213sd vfmsub123ss vfmsub123sd vfmsub231ss vfmsub231sd vfmsub321ss vfmsub321sd vfnmadd132ss vfnmadd132sd vfnmadd312ss vfnmadd312sd vfnmadd213ss vfnmadd213sd vfnmadd123ss vfnmadd123sd vfnmadd231ss vfnmadd231sd vfnmadd321ss vfnmadd321sd vfnmsub132ss vfnmsub132sd vfnmsub312ss vfnmsub312sd vfnmsub213ss vfnmsub213sd vfnmsub123ss vfnmsub123sd vfnmsub231ss vfnmsub231sd vfnmsub321ss vfnmsub321sd rdfsbase rdgsbase rdrand wrfsbase wrgsbase vcvtph2ps vcvtps2ph adcx adox rdseed clac stac xstore xcryptecb xcryptcbc xcryptctr xcryptcfb xcryptofb montmul xsha1 xsha256 llwpcb slwpcb lwpval lwpins vfmaddpd vfmaddps vfmaddsd vfmaddss vfmaddsubpd vfmaddsubps vfmsubaddpd vfmsubaddps vfmsubpd vfmsubps vfmsubsd vfmsubss vfnmaddpd vfnmaddps vfnmaddsd vfnmaddss vfnmsubpd vfnmsubps vfnmsubsd vfnmsubss vfrczpd vfrczps vfrczsd vfrczss vpcmov vpcomb vpcomd vpcomq vpcomub vpcomud vpcomuq vpcomuw vpcomw vphaddbd vphaddbq vphaddbw vphadddq vphaddubd vphaddubq vphaddubw vphaddudq vphadduwd vphadduwq vphaddwd vphaddwq vphsubbw vphsubdq vphsubwd vpmacsdd vpmacsdqh vpmacsdql vpmacssdd vpmacssdqh vpmacssdql vpmacsswd vpmacssww vpmacswd vpmacsww vpmadcsswd vpmadcswd vpperm vprotb vprotd vprotq vprotw vpshab vpshad vpshaq vpshaw vpshlb vpshld vpshlq vpshlw vbroadcasti128 vpblendd vpbroadcastb vpbroadcastw vpbroadcastd vpbroadcastq vpermd vpermpd vpermps vpermq vperm2i128 vextracti128 vinserti128 vpmaskmovd vpmaskmovq vpsllvd vpsllvq vpsravd vpsrlvd vpsrlvq vgatherdpd vgatherqpd vgatherdps vgatherqps vpgatherdd vpgatherqd vpgatherdq vpgatherqq xabort xbegin xend xtest andn bextr blci blcic blsi blsic blcfill blsfill blcmsk blsmsk blsr blcs bzhi mulx pdep pext rorx sarx shlx shrx tzcnt tzmsk t1mskc valignd valignq vblendmpd vblendmps vbroadcastf32x4 vbroadcastf64x4 vbroadcasti32x4 vbroadcasti64x4 vcompresspd vcompressps vcvtpd2udq vcvtps2udq vcvtsd2usi vcvtss2usi vcvttpd2udq vcvttps2udq vcvttsd2usi vcvttss2usi vcvtudq2pd vcvtudq2ps vcvtusi2sd vcvtusi2ss vexpandpd vexpandps vextractf32x4 vextractf64x4 vextracti32x4 vextracti64x4 vfixupimmpd vfixupimmps vfixupimmsd vfixupimmss vgetexppd vgetexpps vgetexpsd vgetexpss vgetmantpd vgetmantps vgetmantsd vgetmantss vinsertf32x4 vinsertf64x4 vinserti32x4 vinserti64x4 vmovdqa32 vmovdqa64 vmovdqu32 vmovdqu64 vpabsq vpandd vpandnd vpandnq vpandq vpblendmd vpblendmq vpcmpltd vpcmpled vpcmpneqd vpcmpnltd vpcmpnled vpcmpd vpcmpltq vpcmpleq vpcmpneqq vpcmpnltq vpcmpnleq vpcmpq vpcmpequd vpcmpltud vpcmpleud vpcmpnequd vpcmpnltud vpcmpnleud vpcmpud vpcmpequq vpcmpltuq vpcmpleuq vpcmpnequq vpcmpnltuq vpcmpnleuq vpcmpuq vpcompressd vpcompressq vpermi2d vpermi2pd vpermi2ps vpermi2q vpermt2d vpermt2pd vpermt2ps vpermt2q vpexpandd vpexpandq vpmaxsq vpmaxuq vpminsq vpminuq vpmovdb vpmovdw vpmovqb vpmovqd vpmovqw vpmovsdb vpmovsdw vpmovsqb vpmovsqd vpmovsqw vpmovusdb vpmovusdw vpmovusqb vpmovusqd vpmovusqw vpord vporq vprold vprolq vprolvd vprolvq vprord vprorq vprorvd vprorvq vpscatterdd vpscatterdq vpscatterqd vpscatterqq vpsraq vpsravq vpternlogd vpternlogq vptestmd vptestmq vptestnmd vptestnmq vpxord vpxorq vrcp14pd vrcp14ps vrcp14sd vrcp14ss vrndscalepd vrndscaleps vrndscalesd vrndscaless vrsqrt14pd vrsqrt14ps vrsqrt14sd vrsqrt14ss vscalefpd vscalefps vscalefsd vscalefss vscatterdpd vscatterdps vscatterqpd vscatterqps vshuff32x4 vshuff64x2 vshufi32x4 vshufi64x2 kandnw kandw kmovw knotw kortestw korw kshiftlw kshiftrw kunpckbw kxnorw kxorw vpbroadcastmb2q vpbroadcastmw2d vpconflictd vpconflictq vplzcntd vplzcntq vexp2pd vexp2ps vrcp28pd vrcp28ps vrcp28sd vrcp28ss vrsqrt28pd vrsqrt28ps vrsqrt28sd vrsqrt28ss vgatherpf0dpd vgatherpf0dps vgatherpf0qpd vgatherpf0qps vgatherpf1dpd vgatherpf1dps vgatherpf1qpd vgatherpf1qps vscatterpf0dpd vscatterpf0dps vscatterpf0qpd vscatterpf0qps vscatterpf1dpd vscatterpf1dps vscatterpf1qpd vscatterpf1qps prefetchwt1 bndmk bndcl bndcu bndcn bndmov bndldx bndstx sha1rnds4 sha1nexte sha1msg1 sha1msg2 sha256rnds2 sha256msg1 sha256msg2 hint_nop0 hint_nop1 hint_nop2 hint_nop3 hint_nop4 hint_nop5 hint_nop6 hint_nop7 hint_nop8 hint_nop9 hint_nop10 hint_nop11 hint_nop12 hint_nop13 hint_nop14 hint_nop15 hint_nop16 hint_nop17 hint_nop18 hint_nop19 hint_nop20 hint_nop21 hint_nop22 hint_nop23 hint_nop24 hint_nop25 hint_nop26 hint_nop27 hint_nop28 hint_nop29 hint_nop30 hint_nop31 hint_nop32 hint_nop33 hint_nop34 hint_nop35 hint_nop36 hint_nop37 hint_nop38 hint_nop39 hint_nop40 hint_nop41 hint_nop42 hint_nop43 hint_nop44 hint_nop45 hint_nop46 hint_nop47 hint_nop48 hint_nop49 hint_nop50 hint_nop51 hint_nop52 hint_nop53 hint_nop54 hint_nop55 hint_nop56 hint_nop57 hint_nop58 hint_nop59 hint_nop60 hint_nop61 hint_nop62 hint_nop63",
          built_in: "ip eip rip al ah bl bh cl ch dl dh sil dil bpl spl r8b r9b r10b r11b r12b r13b r14b r15b ax bx cx dx si di bp sp r8w r9w r10w r11w r12w r13w r14w r15w eax ebx ecx edx esi edi ebp esp eip r8d r9d r10d r11d r12d r13d r14d r15d rax rbx rcx rdx rsi rdi rbp rsp r8 r9 r10 r11 r12 r13 r14 r15 cs ds es fs gs ss st st0 st1 st2 st3 st4 st5 st6 st7 mm0 mm1 mm2 mm3 mm4 mm5 mm6 mm7 xmm0  xmm1  xmm2  xmm3  xmm4  xmm5  xmm6  xmm7  xmm8  xmm9 xmm10  xmm11 xmm12 xmm13 xmm14 xmm15 xmm16 xmm17 xmm18 xmm19 xmm20 xmm21 xmm22 xmm23 xmm24 xmm25 xmm26 xmm27 xmm28 xmm29 xmm30 xmm31 ymm0  ymm1  ymm2  ymm3  ymm4  ymm5  ymm6  ymm7  ymm8  ymm9 ymm10  ymm11 ymm12 ymm13 ymm14 ymm15 ymm16 ymm17 ymm18 ymm19 ymm20 ymm21 ymm22 ymm23 ymm24 ymm25 ymm26 ymm27 ymm28 ymm29 ymm30 ymm31 zmm0  zmm1  zmm2  zmm3  zmm4  zmm5  zmm6  zmm7  zmm8  zmm9 zmm10  zmm11 zmm12 zmm13 zmm14 zmm15 zmm16 zmm17 zmm18 zmm19 zmm20 zmm21 zmm22 zmm23 zmm24 zmm25 zmm26 zmm27 zmm28 zmm29 zmm30 zmm31 k0 k1 k2 k3 k4 k5 k6 k7 bnd0 bnd1 bnd2 bnd3 cr0 cr1 cr2 cr3 cr4 cr8 dr0 dr1 dr2 dr3 dr8 tr3 tr4 tr5 tr6 tr7 r0 r1 r2 r3 r4 r5 r6 r7 r0b r1b r2b r3b r4b r5b r6b r7b r0w r1w r2w r3w r4w r5w r6w r7w r0d r1d r2d r3d r4d r5d r6d r7d r0h r1h r2h r3h r0l r1l r2l r3l r4l r5l r6l r7l r8l r9l r10l r11l r12l r13l r14l r15l db dw dd dq dt ddq do dy dz resb resw resd resq rest resdq reso resy resz incbin equ times byte word dword qword nosplit rel abs seg wrt strict near far a32 ptr",
          meta: "%define %xdefine %+ %undef %defstr %deftok %assign %strcat %strlen %substr %rotate %elif %else %endif %if %ifmacro %ifctx %ifidn %ifidni %ifid %ifnum %ifstr %iftoken %ifempty %ifenv %error %warning %fatal %rep %endrep %include %push %pop %repl %pathsearch %depend %use %arg %stacksize %local %line %comment %endcomment .nolist __FILE__ __LINE__ __SECT__  __BITS__ __OUTPUT_FORMAT__ __DATE__ __TIME__ __DATE_NUM__ __TIME_NUM__ __UTC_DATE__ __UTC_TIME__ __UTC_DATE_NUM__ __UTC_TIME_NUM__  __PASS__ struc endstruc istruc at iend align alignb sectalign daz nodaz up down zero default option assume public bits use16 use32 use64 default section segment absolute extern global common cpu float __utf16__ __utf16le__ __utf16be__ __utf32__ __utf32le__ __utf32be__ __float8__ __float16__ __float32__ __float64__ __float80m__ __float80e__ __float128l__ __float128h__ __Infinity__ __QNaN__ __SNaN__ Inf NaN QNaN SNaN float8 float16 float32 float64 float80m float80e float128l float128h __FLOAT_DAZ__ __FLOAT_ROUND__ __FLOAT__"
        },
        contains: [e.COMMENT(";", "$", {
          relevance: 0
        }), {
          className: "number",
          variants: [{
            begin: "\\b(?:([0-9][0-9_]*)?\\.[0-9_]*(?:[eE][+-]?[0-9_]+)?|(0[Xx])?[0-9][0-9_]*(\\.[0-9_]*)?(?:[pP](?:[+-]?[0-9_]+)?)?)\\b",
            relevance: 0
          }, {
            begin: "\\$[0-9][0-9A-Fa-f]*",
            relevance: 0
          }, {
            begin: "\\b(?:[0-9A-Fa-f][0-9A-Fa-f_]*[Hh]|[0-9][0-9_]*[DdTt]?|[0-7][0-7_]*[QqOo]|[0-1][0-1_]*[BbYy])\\b"
          }, {
            begin: "\\b(?:0[Xx][0-9A-Fa-f_]+|0[DdTt][0-9_]+|0[QqOo][0-7_]+|0[BbYy][0-1_]+)\\b"
          }]
        }, e.QUOTE_STRING_MODE, {
          className: "string",
          variants: [{
            begin: "'",
            end: "[^\\\\]'"
          }, {
            begin: "`",
            end: "[^\\\\]`"
          }],
          relevance: 0
        }, {
          className: "symbol",
          variants: [{
            begin: "^\\s*[A-Za-z._?][A-Za-z0-9_$#@~.?]*(:|\\s+label)"
          }, {
            begin: "^\\s*%%[A-Za-z0-9_$#@~.?]*:"
          }],
          relevance: 0
        }, {
          className: "subst",
          begin: "%[0-9]+",
          relevance: 0
        }, {
          className: "subst",
          begin: "%!S+",
          relevance: 0
        }, {
          className: "meta",
          begin: /^\s*\.[\w_-]+/
        }]
      };
    }
    mxa.exports = pkp;
  });
  var gxa = __commonJS(($Qy, hxa) => {
    function mkp(e) {
      let t = ["if", "then", "else", "do", "while", "until", "for", "loop", "import", "with", "is", "as", "where", "when", "by", "data", "constant", "integer", "real", "text", "name", "boolean", "symbol", "infix", "prefix", "postfix", "block", "tree"];
      let n = ["in", "mod", "rem", "and", "or", "xor", "not", "abs", "sign", "floor", "ceil", "sqrt", "sin", "cos", "tan", "asin", "acos", "atan", "exp", "expm1", "log", "log2", "log10", "log1p", "pi", "at", "text_length", "text_range", "text_find", "text_replace", "contains", "page", "slide", "basic_slide", "title_slide", "title", "subtitle", "fade_in", "fade_out", "fade_at", "clear_color", "color", "line_color", "line_width", "texture_wrap", "texture_transform", "texture", "scale_?x", "scale_?y", "scale_?z?", "translate_?x", "translate_?y", "translate_?z?", "rotate_?x", "rotate_?y", "rotate_?z?", "rectangle", "circle", "ellipse", "sphere", "path", "line_to", "move_to", "quad_to", "curve_to", "theme", "background", "contents", "locally", "time", "mouse_?x", "mouse_?y", "mouse_buttons"];
      let r = ["ObjectLoader", "Animate", "MovieCredits", "Slides", "Filters", "Shading", "Materials", "LensFlare", "Mapping", "VLCAudioVideo", "StereoDecoder", "PointCloud", "NetworkAccess", "RemoteControl", "RegExp", "ChromaKey", "Snowfall", "NodeJS", "Speech", "Charts"];
      let s = {
        $pattern: /[a-zA-Z][a-zA-Z0-9_?]*/,
        keyword: t,
        literal: ["true", "false", "nil"],
        built_in: n.concat(r)
      };
      let i = {
        className: "string",
        begin: '"',
        end: '"',
        illegal: "\\n"
      };
      let a = {
        className: "string",
        begin: "'",
        end: "'",
        illegal: "\\n"
      };
      let l = {
        className: "string",
        begin: "<<",
        end: ">>"
      };
      let c = {
        className: "number",
        begin: "[0-9]+#[0-9A-Z_]+(\\.[0-9-A-Z_]+)?#?([Ee][+-]?[0-9]+)?"
      };
      let u = {
        beginKeywords: "import",
        end: "$",
        keywords: s,
        contains: [i]
      };
      let d = {
        className: "function",
        begin: /[a-z][^\n]*->/,
        returnBegin: true,
        end: /->/,
        contains: [e.inherit(e.TITLE_MODE, {
          starts: {
            endsWithParent: true,
            keywords: s
          }
        })]
      };
      return {
        name: "XL",
        aliases: ["tao"],
        keywords: s,
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, i, a, l, d, u, c, e.NUMBER_MODE]
      };
    }
    hxa.exports = mkp;
  });
  var _xa = __commonJS((HQy, yxa) => {
    function fkp(e) {
      let t = e.regex;
      let n = t.concat(/[\p{L}_]/u, t.optional(/[\p{L}0-9_.-]*:/u), /[\p{L}0-9_.-]*/u);
      let r = /[\p{L}0-9._:-]+/u;
      let o = {
        className: "symbol",
        begin: /&[a-z]+;|&#[0-9]+;|&#x[a-f0-9]+;/
      };
      let s = {
        begin: /\s/,
        contains: [{
          className: "keyword",
          begin: /#?[a-z_][a-z1-9_-]+/,
          illegal: /\n/
        }]
      };
      let i = e.inherit(s, {
        begin: /\(/,
        end: /\)/
      });
      let a = e.inherit(e.APOS_STRING_MODE, {
        className: "string"
      });
      let l = e.inherit(e.QUOTE_STRING_MODE, {
        className: "string"
      });
      let c = {
        endsWithParent: true,
        illegal: /</,
        relevance: 0,
        contains: [{
          className: "attr",
          begin: r,
          relevance: 0
        }, {
          begin: /=\s*/,
          relevance: 0,
          contains: [{
            className: "string",
            endsParent: true,
            variants: [{
              begin: /"/,
              end: /"/,
              contains: [o]
            }, {
              begin: /'/,
              end: /'/,
              contains: [o]
            }, {
              begin: /[^\s"'=<>`]+/
            }]
          }]
        }]
      };
      return {
        name: "HTML, XML",
        aliases: ["html", "xhtml", "rss", "atom", "xjb", "xsd", "xsl", "plist", "wsf", "svg"],
        case_insensitive: true,
        unicodeRegex: true,
        contains: [{
          className: "meta",
          begin: /<![a-z]/,
          end: />/,
          relevance: 10,
          contains: [s, l, a, i, {
            begin: /\[/,
            end: /\]/,
            contains: [{
              className: "meta",
              begin: /<![a-z]/,
              end: />/,
              contains: [s, i, l, a]
            }]
          }]
        }, e.COMMENT(/<!--/, /-->/, {
          relevance: 10
        }), {
          begin: /<!\[CDATA\[/,
          end: /\]\]>/,
          relevance: 10
        }, o, {
          className: "meta",
          end: /\?>/,
          variants: [{
            begin: /<\?xml/,
            relevance: 10,
            contains: [l]
          }, {
            begin: /<\?[a-z][a-z0-9]+/
          }]
        }, {
          className: "tag",
          begin: /<style(?=\s|>)/,
          end: />/,
          keywords: {
            name: "style"
          },
          contains: [c],
          starts: {
            end: /<\/style>/,
            returnEnd: true,
            subLanguage: ["css", "xml"]
          }
        }, {
          className: "tag",
          begin: /<script(?=\s|>)/,
          end: />/,
          keywords: {
            name: "script"
          },
          contains: [c],
          starts: {
            end: /<\/script>/,
            returnEnd: true,
            subLanguage: ["javascript", "handlebars", "xml"]
          }
        }, {
          className: "tag",
          begin: /<>|<\/>/
        }, {
          className: "tag",
          begin: t.concat(/</, t.lookahead(t.concat(n, t.either(/\/>/, />/, /\s/)))),
          end: /\/?>/,
          contains: [{
            className: "name",
            begin: n,
            relevance: 0,
            starts: c
          }]
        }, {
          className: "tag",
          begin: t.concat(/<\//, t.lookahead(t.concat(n, />/))),
          contains: [{
            className: "name",
            begin: n,
            relevance: 0
          }, {
            begin: />/,
            relevance: 0,
            endsParent: true
          }]
        }]
      };
    }
    yxa.exports = fkp;
  });
  var Sxa = __commonJS((jQy, bxa) => {
    function hkp(e) {
      return {
        name: "XQuery",
        aliases: ["xpath", "xq", "xqm"],
        case_insensitive: false,
        illegal: /(proc)|(abstract)|(extends)|(until)|(#)/,
        keywords: {
          $pattern: /[a-zA-Z$][a-zA-Z0-9_:-]*/,
          keyword: ["module", "schema", "namespace", "boundary-space", "preserve", "no-preserve", "strip", "default", "collation", "base-uri", "ordering", "context", "decimal-format", "decimal-separator", "copy-namespaces", "empty-sequence", "except", "exponent-separator", "external", "grouping-separator", "inherit", "no-inherit", "lax", "minus-sign", "per-mille", "percent", "schema-attribute", "schema-element", "strict", "unordered", "zero-digit", "declare", "import", "option", "function", "validate", "variable", "for", "at", "in", "let", "where", "order", "group", "by", "return", "if", "then", "else", "tumbling", "sliding", "window", "start", "when", "only", "end", "previous", "next", "stable", "ascending", "descending", "allowing", "empty", "greatest", "least", "some", "every", "satisfies", "switch", "case", "typeswitch", "try", "catch", "and", "or", "to", "union", "intersect", "instance", "of", "treat", "as", "castable", "cast", "map", "array", "delete", "insert", "into", "replace", "value", "rename", "copy", "modify", "update"],
          type: ["item", "document-node", "node", "attribute", "document", "element", "comment", "namespace", "namespace-node", "processing-instruction", "text", "construction", "xs:anyAtomicType", "xs:untypedAtomic", "xs:duration", "xs:time", "xs:decimal", "xs:float", "xs:double", "xs:gYearMonth", "xs:gYear", "xs:gMonthDay", "xs:gMonth", "xs:gDay", "xs:boolean", "xs:base64Binary", "xs:hexBinary", "xs:anyURI", "xs:QName", "xs:NOTATION", "xs:dateTime", "xs:dateTimeStamp", "xs:date", "xs:string", "xs:normalizedString", "xs:token", "xs:language", "xs:NMTOKEN", "xs:Name", "xs:NCName", "xs:ID", "xs:IDREF", "xs:ENTITY", "xs:integer", "xs:nonPositiveInteger", "xs:negativeInteger", "xs:long", "xs:int", "xs:short", "xs:byte", "xs:nonNegativeInteger", "xs:unisignedLong", "xs:unsignedInt", "xs:unsignedShort", "xs:unsignedByte", "xs:positiveInteger", "xs:yearMonthDuration", "xs:dayTimeDuration"],
          literal: ["eq", "ne", "lt", "le", "gt", "ge", "is", "self::", "child::", "descendant::", "descendant-or-self::", "attribute::", "following::", "following-sibling::", "parent::", "ancestor::", "ancestor-or-self::", "preceding::", "preceding-sibling::", "NaN"]
        },
        contains: [{
          className: "variable",
          begin: /[$][\w\-:]+/
        }, {
          className: "built_in",
          variants: [{
            begin: /\barray:/,
            end: /(?:append|filter|flatten|fold-(?:left|right)|for-each(?:-pair)?|get|head|insert-before|join|put|remove|reverse|size|sort|subarray|tail)\b/
          }, {
            begin: /\bmap:/,
            end: /(?:contains|entry|find|for-each|get|keys|merge|put|remove|size)\b/
          }, {
            begin: /\bmath:/,
            end: /(?:a(?:cos|sin|tan[2]?)|cos|exp(?:10)?|log(?:10)?|pi|pow|sin|sqrt|tan)\b/
          }, {
            begin: /\bop:/,
            end: /\(/,
            excludeEnd: true
          }, {
            begin: /\bfn:/,
            end: /\(/,
            excludeEnd: true
          }, {
            begin: /[^</$:'"-]\b(?:abs|accumulator-(?:after|before)|adjust-(?:date(?:Time)?|time)-to-timezone|analyze-string|apply|available-(?:environment-variables|system-properties)|avg|base-uri|boolean|ceiling|codepoints?-(?:equal|to-string)|collation-key|collection|compare|concat|contains(?:-token)?|copy-of|count|current(?:-)?(?:date(?:Time)?|time|group(?:ing-key)?|output-uri|merge-(?:group|key))?data|dateTime|days?-from-(?:date(?:Time)?|duration)|deep-equal|default-(?:collation|language)|distinct-values|document(?:-uri)?|doc(?:-available)?|element-(?:available|with-id)|empty|encode-for-uri|ends-with|environment-variable|error|escape-html-uri|exactly-one|exists|false|filter|floor|fold-(?:left|right)|for-each(?:-pair)?|format-(?:date(?:Time)?|time|integer|number)|function-(?:arity|available|lookup|name)|generate-id|has-children|head|hours-from-(?:dateTime|duration|time)|id(?:ref)?|implicit-timezone|in-scope-prefixes|index-of|innermost|insert-before|iri-to-uri|json-(?:doc|to-xml)|key|lang|last|load-xquery-module|local-name(?:-from-QName)?|(?:lower|upper)-case|matches|max|minutes-from-(?:dateTime|duration|time)|min|months?-from-(?:date(?:Time)?|duration)|name(?:space-uri-?(?:for-prefix|from-QName)?)?|nilled|node-name|normalize-(?:space|unicode)|not|number|one-or-more|outermost|parse-(?:ietf-date|json)|path|position|(?:prefix-from-)?QName|random-number-generator|regex-group|remove|replace|resolve-(?:QName|uri)|reverse|root|round(?:-half-to-even)?|seconds-from-(?:dateTime|duration|time)|snapshot|sort|starts-with|static-base-uri|stream-available|string-?(?:join|length|to-codepoints)?|subsequence|substring-?(?:after|before)?|sum|system-property|tail|timezone-from-(?:date(?:Time)?|time)|tokenize|trace|trans(?:form|late)|true|type-available|unordered|unparsed-(?:entity|text)?-?(?:public-id|uri|available|lines)?|uri-collection|xml-to-json|years?-from-(?:date(?:Time)?|duration)|zero-or-one)\b/
          }, {
            begin: /\blocal:/,
            end: /\(/,
            excludeEnd: true
          }, {
            begin: /\bzip:/,
            end: /(?:zip-file|(?:xml|html|text|binary)-entry| (?:update-)?entries)\b/
          }, {
            begin: /\b(?:util|db|functx|app|xdmp|xmldb):/,
            end: /\(/,
            excludeEnd: true
          }]
        }, {
          className: "string",
          variants: [{
            begin: /"/,
            end: /"/,
            contains: [{
              begin: /""/,
              relevance: 0
            }]
          }, {
            begin: /'/,
            end: /'/,
            contains: [{
              begin: /''/,
              relevance: 0
            }]
          }]
        }, {
          className: "number",
          begin: /(\b0[0-7_]+)|(\b0x[0-9a-fA-F_]+)|(\b[1-9][0-9_]*(\.[0-9_]+)?)|[0_]\b/,
          relevance: 0
        }, {
          className: "comment",
          begin: /\(:/,
          end: /:\)/,
          relevance: 10,
          contains: [{
            className: "doctag",
            begin: /@\w+/
          }]
        }, {
          className: "meta",
          begin: /%[\w\-:]+/
        }, {
          className: "title",
          begin: /\bxquery version "[13]\.[01]"\s?(?:encoding ".+")?/,
          end: /;/
        }, {
          beginKeywords: "element attribute comment document processing-instruction",
          end: /\{/,
          excludeEnd: true
        }, {
          begin: /<([\w._:-]+)(\s+\S*=('|").*('|"))?>/,
          end: /(\/[\w._:-]+>)/,
          subLanguage: "xml",
          contains: [{
            begin: /\{/,
            end: /\}/,
            subLanguage: "xquery"
          }, "self"]
        }]
      };
    }
    bxa.exports = hkp;
  });
  var Exa = __commonJS((qQy, Txa) => {
    function gkp(e) {
      let r = {
        className: "attr",
        variants: [{
          begin: /[\w*@][\w*@ :()\./-]*:(?=[ \t]|$)/
        }, {
          begin: /"[\w*@][\w*@ :()\./-]*":(?=[ \t]|$)/
        }, {
          begin: /'[\w*@][\w*@ :()\./-]*':(?=[ \t]|$)/
        }]
      };
      let o = {
        className: "template-variable",
        variants: [{
          begin: /\{\{/,
          end: /\}\}/
        }, {
          begin: /%\{/,
          end: /\}/
        }]
      };
      let s = {
        className: "string",
        relevance: 0,
        begin: /'/,
        end: /'/,
        contains: [{
          match: /''/,
          scope: "char.escape",
          relevance: 0
        }]
      };
      let i = {
        className: "string",
        relevance: 0,
        variants: [{
          begin: /"/,
          end: /"/
        }, {
          begin: /\S+/
        }],
        contains: [e.BACKSLASH_ESCAPE, o]
      };
      let a = e.inherit(i, {
        variants: [{
          begin: /'/,
          end: /'/,
          contains: [{
            begin: /''/,
            relevance: 0
          }]
        }, {
          begin: /"/,
          end: /"/
        }, {
          begin: /[^\s,{}[\]]+/
        }]
      });
      let l = "[0-9]{4}(-[0-9][0-9]){0,2}";
      let c = "([Tt \\t][0-9][0-9]?(:[0-9][0-9]){2})?";
      let u = "(\\.[0-9]*)?";
      let d = "([ \\t])*(Z|[-+][0-9][0-9]?(:[0-9][0-9])?)?";
      let p = {
        className: "number",
        begin: "\\b[0-9]{4}(-[0-9][0-9]){0,2}([Tt \\t][0-9][0-9]?(:[0-9][0-9]){2})?(\\.[0-9]*)?([ \\t])*(Z|[-+][0-9][0-9]?(:[0-9][0-9])?)?\\b"
      };
      let m = {
        end: ",",
        endsWithParent: true,
        excludeEnd: true,
        keywords: "true false yes no null",
        relevance: 0
      };
      let f = {
        begin: /\{/,
        end: /\}/,
        contains: [m],
        illegal: "\\n",
        relevance: 0
      };
      let h = {
        begin: "\\[",
        end: "\\]",
        contains: [m],
        illegal: "\\n",
        relevance: 0
      };
      let g = [r, {
        className: "meta",
        begin: "^---\\s*$",
        relevance: 10
      }, {
        className: "string",
        begin: "[\\|>]([1-9]?[+-])?[ ]*\\n( +)[^ ][^\\n]*\\n(\\2[^\\n]+\\n?)*"
      }, {
        begin: "<%[%=-]?",
        end: "[%-]?%>",
        subLanguage: "ruby",
        excludeBegin: true,
        excludeEnd: true,
        relevance: 0
      }, {
        className: "type",
        begin: "!\\w+![\\w#;/?:@&=+$,.~*'()[\\]]+"
      }, {
        className: "type",
        begin: "!<[\\w#;/?:@&=+$,.~*'()[\\]]+>"
      }, {
        className: "type",
        begin: "![\\w#;/?:@&=+$,.~*'()[\\]]+"
      }, {
        className: "type",
        begin: "!![\\w#;/?:@&=+$,.~*'()[\\]]+"
      }, {
        className: "meta",
        begin: "&" + e.UNDERSCORE_IDENT_RE + "$"
      }, {
        className: "meta",
        begin: "\\*" + e.UNDERSCORE_IDENT_RE + "$"
      }, {
        className: "bullet",
        begin: "-(?=[ ]|$)",
        relevance: 0
      }, e.HASH_COMMENT_MODE, {
        beginKeywords: "true false yes no null",
        keywords: {
          literal: "true false yes no null"
        }
      }, p, {
        className: "number",
        begin: e.C_NUMBER_RE + "\\b",
        relevance: 0
      }, f, h, s, i];
      let y = [...g];
      y.pop();
      y.push(a);
      m.contains = y;
      return {
        name: "YAML",
        case_insensitive: true,
        aliases: ["yml"],
        contains: g
      };
    }
    Txa.exports = gkp;
  });
  var wxa = __commonJS((WQy, vxa) => {
    function ykp(e) {
      let t = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE],
        variants: [e.inherit(e.APOS_STRING_MODE, {
          illegal: null
        }), e.inherit(e.QUOTE_STRING_MODE, {
          illegal: null
        })]
      };
      let n = e.UNDERSCORE_TITLE_MODE;
      let r = {
        variants: [e.BINARY_NUMBER_MODE, e.C_NUMBER_MODE]
      };
      let o = "namespace class interface use extends function return abstract final public protected private static deprecated throw try catch Exception echo empty isset instanceof unset let var new const self require if else elseif switch case default do while loop for continue break likely unlikely __LINE__ __FILE__ __DIR__ __FUNCTION__ __CLASS__ __TRAIT__ __METHOD__ __NAMESPACE__ array boolean float double integer object resource string char long unsigned bool int uint ulong uchar true false null undefined";
      return {
        name: "Zephir",
        aliases: ["zep"],
        keywords: o,
        contains: [e.C_LINE_COMMENT_MODE, e.COMMENT(/\/\*/, /\*\//, {
          contains: [{
            className: "doctag",
            begin: /@[A-Za-z]+/
          }]
        }), {
          className: "string",
          begin: /<<<['"]?\w+['"]?$/,
          end: /^\w+;/,
          contains: [e.BACKSLASH_ESCAPE]
        }, {
          begin: /(::|->)+[a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*/
        }, {
          className: "function",
          beginKeywords: "function fn",
          end: /[;{]/,
          excludeEnd: true,
          illegal: /\$|\[|%/,
          contains: [n, {
            className: "params",
            begin: /\(/,
            end: /\)/,
            keywords: o,
            contains: ["self", e.C_BLOCK_COMMENT_MODE, t, r]
          }]
        }, {
          className: "class",
          beginKeywords: "class interface",
          end: /\{/,
          excludeEnd: true,
          illegal: /[:($"]/,
          contains: [{
            beginKeywords: "extends implements"
          }, n]
        }, {
          beginKeywords: "namespace",
          end: /;/,
          illegal: /[.']/,
          contains: [n]
        }, {
          beginKeywords: "use",
          end: /;/,
          contains: [n]
        }, {
          begin: /=>/
        }, t, r]
      };
    }
    vxa.exports = ykp;
  });
  var fjn;
  var hjn;
  var Cxa;
  var mfo = __lazy(() => {
    fjn = {
      "1c": () => Qba(),
      abnf: () => eSa(),
      accesslog: () => nSa(),
      actionscript: () => oSa(),
      ada: () => iSa(),
      angelscript: () => lSa(),
      apache: () => uSa(),
      applescript: () => pSa(),
      arcade: () => fSa(),
      arduino: () => gSa(),
      armasm: () => _Sa(),
      asciidoc: () => SSa(),
      aspectj: () => ESa(),
      autohotkey: () => wSa(),
      autoit: () => RSa(),
      avrasm: () => kSa(),
      awk: () => ISa(),
      axapta: () => OSa(),
      bash: () => MSa(),
      basic: () => LSa(),
      bnf: () => USa(),
      brainfuck: () => $Sa(),
      c: () => jSa(),
      cal: () => WSa(),
      capnproto: () => VSa(),
      ceylon: () => KSa(),
      clean: () => JSa(),
      clojure: () => QSa(),
      "clojure-repl": () => eTa(),
      cmake: () => nTa(),
      coffeescript: () => oTa(),
      coq: () => iTa(),
      cos: () => lTa(),
      cpp: () => uTa(),
      crmsh: () => pTa(),
      crystal: () => fTa(),
      csharp: () => gTa(),
      csp: () => _Ta(),
      css: () => STa(),
      d: () => ETa(),
      dart: () => wTa(),
      delphi: () => RTa(),
      diff: () => kTa(),
      django: () => ITa(),
      dns: () => OTa(),
      dockerfile: () => MTa(),
      dos: () => LTa(),
      dsconfig: () => UTa(),
      dts: () => $Ta(),
      dust: () => jTa(),
      ebnf: () => WTa(),
      elixir: () => VTa(),
      elm: () => KTa(),
      erb: () => JTa(),
      erlang: () => QTa(),
      "erlang-repl": () => eEa(),
      excel: () => nEa(),
      fix: () => oEa(),
      flix: () => iEa(),
      fortran: () => lEa(),
      fsharp: () => dEa(),
      gams: () => mEa(),
      gauss: () => hEa(),
      gcode: () => yEa(),
      gherkin: () => bEa(),
      glsl: () => TEa(),
      gml: () => vEa(),
      go: () => CEa(),
      golo: () => xEa(),
      gradle: () => AEa(),
      graphql: () => PEa(),
      groovy: () => DEa(),
      haml: () => NEa(),
      handlebars: () => FEa(),
      haskell: () => BEa(),
      haxe: () => HEa(),
      hsp: () => qEa(),
      http: () => GEa(),
      hy: () => zEa(),
      inform7: () => YEa(),
      ini: () => XEa(),
      irpf90: () => ZEa(),
      isbl: () => tva(),
      java: () => sva(),
      javascript: () => uva(),
      "jboss-cli": () => pva(),
      json: () => fva(),
      julia: () => gva(),
      "julia-repl": () => _va(),
      kotlin: () => Sva(),
      lasso: () => Eva(),
      latex: () => wva(),
      ldif: () => Rva(),
      leaf: () => kva(),
      less: () => Ova(),
      lisp: () => Mva(),
      livecodeserver: () => Lva(),
      livescript: () => Uva(),
      llvm: () => $va(),
      lsl: () => jva(),
      lua: () => Wva(),
      makefile: () => Vva(),
      markdown: () => Kva(),
      mathematica: () => Jva(),
      matlab: () => Qva(),
      maxima: () => ewa(),
      mel: () => nwa(),
      mercury: () => owa(),
      mipsasm: () => iwa(),
      mizar: () => lwa(),
      mojolicious: () => uwa(),
      monkey: () => pwa(),
      moonscript: () => fwa(),
      n1ql: () => gwa(),
      nestedtext: () => _wa(),
      nginx: () => Swa(),
      nim: () => Ewa(),
      nix: () => wwa(),
      "node-repl": () => Rwa(),
      nsis: () => kwa(),
      objectivec: () => Iwa(),
      ocaml: () => Owa(),
      openscad: () => Mwa(),
      oxygene: () => Lwa(),
      parser3: () => Uwa(),
      perl: () => $wa(),
      pf: () => jwa(),
      pgsql: () => Wwa(),
      php: () => Vwa(),
      "php-template": () => Kwa(),
      plaintext: () => Jwa(),
      pony: () => Qwa(),
      powershell: () => eCa(),
      processing: () => nCa(),
      profile: () => oCa(),
      prolog: () => iCa(),
      properties: () => lCa(),
      protobuf: () => uCa(),
      puppet: () => pCa(),
      purebasic: () => fCa(),
      python: () => gCa(),
      "python-repl": () => _Ca(),
      q: () => SCa(),
      qml: () => ECa(),
      r: () => wCa(),
      reasonml: () => RCa(),
      rib: () => kCa(),
      roboconf: () => ICa(),
      routeros: () => OCa(),
      rsl: () => MCa(),
      ruby: () => LCa(),
      ruleslanguage: () => UCa(),
      rust: () => $Ca(),
      nZc: () => jCa(),
      scala: () => WCa(),
      scheme: () => VCa(),
      scilab: () => KCa(),
      scss: () => JCa(),
      shell: () => QCa(),
      smali: () => eRa(),
      smalltalk: () => nRa(),
      sml: () => oRa(),
      sqf: () => iRa(),
      sql: () => lRa(),
      stan: () => uRa(),
      stata: () => pRa(),
      step21: () => fRa(),
      stylus: () => gRa(),
      subunit: () => _Ra(),
      swift: () => xRa(),
      taggerscript: () => ARa(),
      tap: () => PRa(),
      tcl: () => DRa(),
      thrift: () => NRa(),
      tp: () => FRa(),
      twig: () => BRa(),
      typescript: () => KRa(),
      vala: () => JRa(),
      vbnet: () => QRa(),
      vbscript: () => exa(),
      "vbscript-html": () => nxa(),
      verilog: () => oxa(),
      vhdl: () => ixa(),
      vim: () => lxa(),
      wasm: () => uxa(),
      wren: () => pxa(),
      x86asm: () => fxa(),
      xl: () => gxa(),
      xml: () => _xa(),
      xquery: () => Sxa(),
      yaml: () => Exa(),
      zephir: () => wxa()
    };
    hjn = {
      as: "actionscript",
      asc: "angelscript",
      apacheconf: "apache",
      osascript: "applescript",
      ino: "arduino",
      arm: "armasm",
      adoc: "asciidoc",
      ahk: "autohotkey",
      "x++": "axapta",
      sh: "bash",
      zsh: "bash",
      bf: "brainfuck",
      h: "c",
      capnp: "capnproto",
      icl: "clean",
      dcl: "clean",
      clj: "clojure",
      edn: "clojure",
      "cmake.in": "cmake",
      coffee: "coffeescript",
      cson: "coffeescript",
      iced: "coffeescript",
      cls: "cos",
      cc: "cpp",
      "c++": "cpp",
      "h++": "cpp",
      hpp: "cpp",
      hh: "cpp",
      hxx: "cpp",
      cxx: "cpp",
      crm: "crmsh",
      pcmk: "crmsh",
      cr: "crystal",
      cs: "csharp",
      "c#": "csharp",
      dpr: "delphi",
      dfm: "delphi",
      pas: "delphi",
      pascal: "delphi",
      patch: "diff",
      jinja: "django",
      bind: "dns",
      zone: "dns",
      docker: "dockerfile",
      bat: "dos",
      cmd: "dos",
      dst: "dust",
      ex: "elixir",
      exs: "elixir",
      erl: "erlang",
      xlsx: "excel",
      xls: "excel",
      f90: "fortran",
      f95: "fortran",
      fs: "fsharp",
      "f#": "fsharp",
      gms: "gams",
      gss: "gauss",
      nc: "gcode",
      feature: "gherkin",
      golang: "go",
      gql: "graphql",
      hbs: "handlebars",
      "html.hbs": "handlebars",
      "html.handlebars": "handlebars",
      htmlbars: "handlebars",
      hs: "haskell",
      hx: "haxe",
      https: "http",
      hylang: "hy",
      i7: "inform7",
      toml: "ini",
      jsp: "java",
      js: "javascript",
      jsx: "javascript",
      mjs: "javascript",
      cjs: "javascript",
      "wildfly-cli": "jboss-cli",
      jsonc: "json",
      jldoctest: "julia-repl",
      kt: "kotlin",
      kts: "kotlin",
      ls: "livescript",
      lassoscript: "lasso",
      tex: "latex",
      pluto: "lua",
      mk: "makefile",
      mak: "makefile",
      make: "makefile",
      md: "markdown",
      mkdown: "markdown",
      mkd: "markdown",
      mma: "mathematica",
      wl: "mathematica",
      m: "mercury",
      moo: "mercury",
      mips: "mipsasm",
      moon: "moonscript",
      nt: "nestedtext",
      nginxconf: "nginx",
      nixos: "nix",
      mm: "objectivec",
      objc: "objectivec",
      "obj-c": "objectivec",
      "obj-c++": "objectivec",
      "objective-c++": "objectivec",
      ml: "sml",
      scad: "openscad",
      pl: "perl",
      pm: "perl",
      "pf.conf": "pf",
      postgres: "pgsql",
      postgresql: "pgsql",
      text: "plaintext",
      txt: "plaintext",
      pwsh: "powershell",
      ps: "powershell",
      ps1: "powershell",
      pde: "processing",
      proto: "protobuf",
      pp: "puppet",
      pb: "purebasic",
      pbi: "purebasic",
      py: "python",
      gyp: "python",
      ipython: "python",
      pycon: "python-repl",
      k: "q",
      kdb: "q",
      qt: "qml",
      re: "reasonml",
      graph: "roboconf",
      instances: "roboconf",
      mikrotik: "routeros",
      rb: "ruby",
      gemspec: "ruby",
      podspec: "ruby",
      thor: "ruby",
      irb: "ruby",
      rs: "rust",
      scm: "scheme",
      sci: "scilab",
      console: "shell",
      shellsession: "shell",
      st: "smalltalk",
      stanfuncs: "stan",
      do: "stata",
      ado: "stata",
      p21: "step21",
      step: "step21",
      stp: "step21",
      styl: "stylus",
      tk: "tcl",
      craftcms: "twig",
      ts: "typescript",
      tsx: "typescript",
      mts: "typescript",
      cts: "typescript",
      vb: "vbnet",
      vbs: "vbscript",
      v: "verilog",
      sv: "verilog",
      svh: "verilog",
      tao: "xl",
      html: "xml",
      xhtml: "xml",
      rss: "xml",
      atom: "xml",
      xjb: "xml",
      xsd: "xml",
      xsl: "xml",
      plist: "xml",
      wsf: "xml",
      svg: "xml",
      xpath: "xquery",
      xq: "xquery",
      xqm: "xquery",
      yml: "yaml",
      zep: "zephir",
      mysql: "sql",
      oracle: "sql",
      freepascal: "delphi",
      lazarus: "delphi",
      lpr: "delphi",
      lfm: "delphi",
      php3: "php",
      php4: "php",
      php5: "php",
      php6: "php",
      php7: "php",
      php8: "php"
    };
    Cxa = {
      asciidoc: ["xml"],
      "clojure-repl": ["clojure"],
      coffeescript: ["javascript"],
      cos: ["javascript", "sql", "xml"],
      dart: ["markdown"],
      django: ["xml"],
      dockerfile: ["bash"],
      dust: ["xml"],
      erb: ["ruby", "xml"],
      haml: ["ruby"],
      handlebars: ["xml"],
      javascript: ["css", "graphql", "xml"],
      "julia-repl": ["julia"],
      livescript: ["javascript"],
      markdown: ["xml"],
      mojolicious: ["perl", "xml"],
      nix: ["markdown"],
      "node-repl": ["javascript"],
      parser3: ["xml"],
      perl: ["mojolicious"],
      pgsql: ["bash", "java", "json", "lua", "perl", "php", "python", "r", "ruby", "scheme", "tcl", "xml"],
      "php-template": ["php", "xml"],
      "python-repl": ["python"],
      qml: ["xml"],
      shell: ["bash"],
      tap: ["yaml"],
      twig: ["xml"],
      typescript: ["css", "graphql", "xml"],
      "vbscript-html": ["vbscript", "xml"],
      xml: ["css", "handlebars", "javascript"],
      xquery: ["xml"],
      yaml: ["ruby"]
    };
  });
  function Rxa(e) {
    for (let [t, n] of Object.entries(_kp)) {
      if (!e.getLanguage(t)) {
        e.registerLanguage(t, n);
      }
    }
    for (let [t, n] of ffo) {
      if (!e.getLanguage(t)) {
        Tkp(e, t, n, {
          emitSadTelemetry: true
        });
      }
    }
    Skp = e;
  }
  function Tkp(e, t, n, {
    emitSadTelemetry: r
  }) {
    try {
      let o = n(e);
      e.registerLanguage(t, () => o);
      e.highlight("", {
        language: t,
        ignoreIllegals: true
      });
      return true;
    } catch (o) {
      if (ffo.delete(t), e.getLanguage(t)) {
        e.unregisterLanguage(t);
      }
      if (r) {
        Et("plugin_hljs_languages", "resolve_failed");
      }
      logForDebugging(`plugin hljs grammar '${t}' failed to resolve at registration: ${o instanceof Error ? o.message : String(o)}`, {
        level: "error"
      });
      return false;
    }
  }
  function hfo() {
    return 0;
  }
  function xxa(e) {
    return ffo.vZc(e) || bkp.vZc(e);
  }
  var _kp;
  var ffo;
  var bkp;
  var Skp = null;
  var SWt = __lazy(() => {
    ln();
    je();
    mfo();
    _kp = {
      cedar: Nvp
    };
    ffo = new Map();
    bkp = new Set();
  });
  var Jxa = __commonJS((XQy, Yxa) => {
    function Mxa(e) {
      if (e instanceof Map) {
        e.clear = e.delete = e.set = function () {
          throw Error("map is read-only");
        };
      } else if (e instanceof Set) {
        e.add = e.clear = e.delete = function () {
          throw Error("set is read-only");
        };
      }
      Object.freeze(e);
      Object.getOwnPropertyNames(e).forEach(t => {
        let n = e[t];
        let r = typeof n;
        if ((r === "object" || r === "function") && !Object.isFrozen(n)) {
          Mxa(n);
        }
      });
      return e;
    }
    class yfo {
      constructor(e) {
        if (e.data === undefined) {
          e.data = {};
        }
        this.data = e.data;
        this.isMatchIgnored = false;
      }
      ignoreMatch() {
        this.isMatchIgnored = true;
      }
    }
    function Nxa(e) {
      return e.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/"/g, "&quot;").replace(/'/g, "&#x27;");
    }
    function WDe(e, ...t) {
      let n = Object.create(null);
      for (let r in e) {
        n[r] = e[r];
      }
      t.forEach(function (r) {
        for (let o in r) {
          n[o] = r[o];
        }
      });
      return n;
    }
    var kxa = e => !!e.scope;
    var wkp = (e, {
      prefix: t
    }) => {
      if (e.startsWith("language:")) {
        return e.replace("language:", "language-");
      }
      if (e.includes(".")) {
        let n = e.split(".");
        return [`${t}${n.shift()}`, ...n.map((r, o) => `${r}${"_".repeat(o + 1)}`)].join(" ");
      }
      return `${t}${e}`;
    };
    class Lxa {
      constructor(e, t) {
        this.buffer = "";
        this.classPrefix = t.classPrefix;
        e.walk(this);
      }
      addText(e) {
        this.buffer += Nxa(e);
      }
      openNode(e) {
        if (!kxa(e)) {
          return;
        }
        let t = wkp(e.scope, {
          prefix: this.classPrefix
        });
        this.span(t);
      }
      closeNode(e) {
        if (!kxa(e)) {
          return;
        }
        this.buffer += "</span>";
      }
      value() {
        return this.buffer;
      }
      span(e) {
        this.buffer += `<span class="${e}">`;
      }
    }
    var Axa = (e = {}) => {
      let t = {
        children: []
      };
      Object.assign(t, e);
      return t;
    };
    class _fo {
      constructor() {
        this.rootNode = Axa();
        this.stack = [this.rootNode];
      }
      get top() {
        return this.stack[this.stack.length - 1];
      }
      get root() {
        return this.rootNode;
      }
      add(e) {
        this.top.children.push(e);
      }
      openNode(e) {
        let t = Axa({
          scope: e
        });
        this.add(t);
        this.stack.push(t);
      }
      closeNode() {
        if (this.stack.length > 1) {
          return this.stack.pop();
        }
        return;
      }
      closeAllNodes() {
        while (this.closeNode()) {
          ;
        }
      }
      toJSON() {
        return JSON.stringify(this.rootNode, null, 4);
      }
      walk(e) {
        return this.constructor._walk(e, this.rootNode);
      }
      static _walk(e, t) {
        if (typeof t === "string") {
          e.addText(t);
        } else if (t.children) {
          e.openNode(t);
          t.children.forEach(n => this._walk(e, n));
          e.closeNode(t);
        }
        return e;
      }
      static _collapse(e) {
        if (typeof e === "string") {
          return;
        }
        if (!e.children) {
          return;
        }
        if (e.children.every(t => typeof t === "string")) {
          e.children = [e.children.join("")];
        } else {
          e.children.forEach(t => {
            _fo._collapse(t);
          });
        }
      }
    }
    class Fxa extends _fo {
      constructor(e) {
        super();
        this.options = e;
      }
      addText(e) {
        if (e === "") {
          return;
        }
        this.add(e);
      }
      startScope(e) {
        this.openNode(e);
      }
      endScope() {
        this.closeNode();
      }
      __addSublanguage(e, t) {
        let n = e.root;
        if (t) {
          n.scope = `language:${t}`;
        }
        this.add(n);
      }
      toHTML() {
        return new Lxa(this, this.options).value();
      }
      finalize() {
        this.closeAllNodes();
        return true;
      }
    }
    function TWt(e) {
      if (!e) {
        return null;
      }
      if (typeof e === "string") {
        return e;
      }
      return e.source;
    }
    function Uxa(e) {
      return p5e("(?=", e, ")");
    }
    function Ckp(e) {
      return p5e("(?:", e, ")*");
    }
    function Rkp(e) {
      return p5e("(?:", e, ")?");
    }
    function p5e(...e) {
      return e.map(n => TWt(n)).join("");
    }
    function xkp(e) {
      let t = e[e.length - 1];
      if (typeof t === "object" && t.constructor === Object) {
        e.splice(e.length - 1, 1);
        return t;
      } else {
        return {};
      }
    }
    function bfo(...e) {
      return "(" + (xkp(e).capture ? "" : "?:") + e.map(r => TWt(r)).join("|") + ")";
    }
    function Bxa(e) {
      return new RegExp(e.toString() + "|").exec("").length - 1;
    }
    function kkp(e, t) {
      let n = e && e.exec(t);
      return n && n.index === 0;
    }
    function Sfo(e, {
      joinWith: t
    }) {
      let n = 0;
      return e.map(r => {
        n += 1;
        let o = n;
        let s = TWt(r);
        let i = "";
        while (s.length > 0) {
          let a = (/\[(?:[^\\\]]|\\.)*\]|\(\??|\\([1-9][0-9]*)|\\./).exec(s);
          if (!a) {
            i += s;
            break;
          }
          if (i += s.substring(0, a.index), s = s.substring(a.index + a[0].length), a[0][0] === "\\" && a[1]) {
            i += "\\" + String(Number(a[1]) + o);
          } else if (i += a[0], a[0] === "(") {
            n++;
          }
        }
        return i;
      }).map(r => `(${r})`).join(t);
    }
    var Okp = (e = {}) => {
      let t = /^#![ ]*\//;
      if (e.binary) {
        e.begin = p5e(t, /.*\b/, e.binary, /\b.*/);
      }
      return WDe({
        scope: "meta",
        begin: t,
        end: /$/,
        relevance: 0,
        "on:begin": (n, r) => {
          if (n.index !== 0) {
            r.ignoreMatch();
          }
        }
      }, e);
    };
    var EWt = {
      begin: "\\\\[\\s\\S]",
      relevance: 0
    };
    var Dkp = {
      scope: "string",
      begin: "'",
      end: "'",
      illegal: "\\n",
      contains: [EWt]
    };
    var Mkp = {
      scope: "string",
      begin: '"',
      end: '"',
      illegal: "\\n",
      contains: [EWt]
    };
    var Nkp = {
      begin: /\b(a|an|the|are|I'm|isn't|don't|doesn't|won't|but|just|should|pretty|simply|enough|gonna|going|wtf|so|such|will|you|your|they|like|more)\b/
    };
    var _jn = function (e, t, n = {}) {
      let r = WDe({
        scope: "comment",
        begin: e,
        end: t,
        contains: []
      }, n);
      r.contains.push({
        scope: "doctag",
        begin: "[ ]*(?=(TODO|FIXME|NOTE|BUG|OPTIMIZE|HACK|XXX):)",
        end: /(TODO|FIXME|NOTE|BUG|OPTIMIZE|HACK|XXX):/,
        excludeBegin: true,
        relevance: 0
      });
      let o = bfo("I", "a", "is", "so", "us", "to", "at", "if", "in", "it", "on", /[A-Za-z]+['](d|ve|re|ll|t|s|n)/, /[A-Za-z]+[-][a-z]+/, /[A-Za-z][a-z]{2,}/);
      r.contains.push({
        begin: p5e(/[ ]+/, "(", o, /[.]?[:]?([.][ ]|[ ])/, "){3}")
      });
      return r;
    };
    var Lkp = _jn("//", "$");
    var Fkp = _jn("/\\*", "\\*/");
    var Ukp = _jn("#", "$");
    var Bkp = {
      scope: "number",
      begin: "\\b\\d+(\\.\\d+)?",
      relevance: 0
    };
    var $kp = {
      scope: "number",
      begin: "(-?)(\\b0[xX][a-fA-F0-9]+|(\\b\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?)",
      relevance: 0
    };
    var Hkp = {
      scope: "number",
      begin: "\\b(0b[01]+)",
      relevance: 0
    };
    var jkp = {
      scope: "regexp",
      begin: /\/(?=[^/\n]*\/)/,
      end: /\/[gimuy]*/,
      contains: [EWt, {
        begin: /\[/,
        end: /\]/,
        relevance: 0,
        contains: [EWt]
      }]
    };
    var qkp = {
      scope: "title",
      begin: "[a-zA-Z]\\w*",
      relevance: 0
    };
    var Wkp = {
      scope: "title",
      begin: "[a-zA-Z_]\\w*",
      relevance: 0
    };
    var Gkp = {
      begin: "\\.\\s*" + "[a-zA-Z_]\\w*",
      relevance: 0
    };
    var Vkp = function (e) {
      return Object.assign(e, {
        "on:begin": (t, n) => {
          n.data._beginMatch = t[1];
        },
        "on:end": (t, n) => {
          if (n.data._beginMatch !== t[1]) {
            n.ignoreMatch();
          }
        }
      });
    };
    var gjn = Object.freeze({
      __proto__: null,
      APOS_STRING_MODE: Dkp,
      BACKSLASH_ESCAPE: EWt,
      BINARY_NUMBER_MODE: Hkp,
      BINARY_NUMBER_RE: "\\b(0b[01]+)",
      COMMENT: _jn,
      C_BLOCK_COMMENT_MODE: Fkp,
      C_LINE_COMMENT_MODE: Lkp,
      C_NUMBER_MODE: $kp,
      C_NUMBER_RE: "(-?)(\\b0[xX][a-fA-F0-9]+|(\\b\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?)",
      END_SAME_AS_BEGIN: Vkp,
      HASH_COMMENT_MODE: Ukp,
      IDENT_RE: "[a-zA-Z]\\w*",
      MATCH_NOTHING_RE: /\b\B/,
      METHOD_GUARD: Gkp,
      NUMBER_MODE: Bkp,
      NUMBER_RE: "\\b\\d+(\\.\\d+)?",
      PHRASAL_WORDS_MODE: Nkp,
      QUOTE_STRING_MODE: Mkp,
      REGEXP_MODE: jkp,
      RE_STARTERS_RE: "!|!=|!==|%|%=|&|&&|&=|\\*|\\*=|\\+|\\+=|,|-|-=|/=|/|:|;|<<|<<=|<=|<|===|==|=|>>>=|>>=|>=|>>>|>>|>|\\?|\\[|\\{|\\(|\\^|\\^=|\\||\\|=|\\|\\||~",
      SHEBANG: Okp,
      TITLE_MODE: qkp,
      UNDERSCORE_IDENT_RE: "[a-zA-Z_]\\w*",
      UNDERSCORE_TITLE_MODE: Wkp
    });
    function zkp(e, t) {
      if (e.input[e.index - 1] === ".") {
        t.ignoreMatch();
      }
    }
    function Kkp(e, t) {
      if (e.className !== undefined) {
        e.scope = e.className;
        delete e.className;
      }
    }
    function Ykp(e, t) {
      if (!t) {
        return;
      }
      if (!e.beginKeywords) {
        return;
      }
      if (e.begin = "\\b(" + e.beginKeywords.split(" ").join("|") + ")(?!\\.)(?=\\b|\\s)", e.__beforeBegin = zkp, e.keywords = e.keywords || e.beginKeywords, delete e.beginKeywords, e.relevance === undefined) {
        e.relevance = 0;
      }
    }
    function Jkp(e, t) {
      if (!Array.isArray(e.illegal)) {
        return;
      }
      e.illegal = bfo(...e.illegal);
    }
    function Xkp(e, t) {
      if (!e.match) {
        return;
      }
      if (e.begin || e.end) {
        throw Error("begin & end are not supported with match");
      }
      e.begin = e.match;
      delete e.match;
    }
    function Qkp(e, t) {
      if (e.relevance === undefined) {
        e.relevance = 1;
      }
    }
    var Zkp = (e, t) => {
      if (!e.beforeMatch) {
        return;
      }
      if (e.starts) {
        throw Error("beforeMatch cannot be used with starts");
      }
      let n = Object.assign({}, e);
      Object.keys(e).forEach(r => {
        delete e[r];
      });
      e.keywords = n.keywords;
      e.begin = p5e(n.beforeMatch, Uxa(n.begin));
      e.starts = {
        relevance: 0,
        contains: [Object.assign(n, {
          endsParent: true
        })]
      };
      e.relevance = 0;
      delete n.beforeMatch;
    };
    var eAp = ["of", "and", "for", "in", "not", "or", "if", "then", "parent", "list", "value"];
    function Wxa(e, t, n = "keyword") {
      let r = Object.create(null);
      if (typeof e === "string") {
        o(n, e.split(" "));
      } else if (Array.isArray(e)) {
        o(n, e);
      } else {
        Object.keys(e).forEach(function (s) {
          Object.assign(r, Wxa(e[s], t, s));
        });
      }
      return r;
      function o(s, i) {
        if (t) {
          i = i.map(a => a.toLowerCase());
        }
        i.forEach(function (a) {
          let l = a.split("|");
          r[l[0]] = [s, nAp(l[0], l[1])];
        });
      }
    }
    function nAp(e, t) {
      if (t) {
        return Number(t);
      }
      return rAp(e) ? 0 : 1;
    }
    function rAp(e) {
      return eAp.includes(e.toLowerCase());
    }
    var Ixa = {};
    var d5e = e => {
      console.error(e);
    };
    var Pxa = (e, ...t) => {
      console.log(`WARN: ${e}`, ...t);
    };
    var Xpt = (e, t) => {
      if (Ixa[`${e}/${t}`]) {
        return;
      }
      console.log(`Deprecated as of ${e}. ${t}`);
      Ixa[`${e}/${t}`] = true;
    };
    var yjn = Error();
    function Gxa(e, t, {
      key: n
    }) {
      let r = 0;
      let o = e[n];
      let s = {};
      let i = {};
      for (let a = 1; a <= t.length; a++) {
        i[a + r] = o[a];
        s[a + r] = true;
        r += Bxa(t[a - 1]);
      }
      e[n] = i;
      e[n]._emit = s;
      e[n]._multi = true;
    }
    function oAp(e) {
      if (!Array.isArray(e.begin)) {
        return;
      }
      if (e.skip || e.excludeBegin || e.returnBegin) {
        throw d5e("skip, excludeBegin, returnBegin not compatible with beginScope: {}"), yjn;
      }
      if (typeof e.beginScope !== "object" || e.beginScope === null) {
        throw d5e("beginScope must be object"), yjn;
      }
      Gxa(e, e.begin, {
        key: "beginScope"
      });
      e.begin = Sfo(e.begin, {
        joinWith: ""
      });
    }
    function sAp(e) {
      if (!Array.isArray(e.end)) {
        return;
      }
      if (e.skip || e.excludeEnd || e.returnEnd) {
        throw d5e("skip, excludeEnd, returnEnd not compatible with endScope: {}"), yjn;
      }
      if (typeof e.endScope !== "object" || e.endScope === null) {
        throw d5e("endScope must be object"), yjn;
      }
      Gxa(e, e.end, {
        key: "endScope"
      });
      e.end = Sfo(e.end, {
        joinWith: ""
      });
    }
    function iAp(e) {
      if (e.scope && typeof e.scope === "object" && e.scope !== null) {
        e.beginScope = e.scope;
        delete e.scope;
      }
    }
    function aAp(e) {
      if (iAp(e), typeof e.beginScope === "string") {
        e.beginScope = {
          _wrap: e.beginScope
        };
      }
      if (typeof e.endScope === "string") {
        e.endScope = {
          _wrap: e.endScope
        };
      }
      oAp(e);
      sAp(e);
    }
    function lAp(e) {
      function t(i, a) {
        return new RegExp(TWt(i), "m" + (e.case_insensitive ? "i" : "") + (e.unicodeRegex ? "u" : "") + (a ? "g" : ""));
      }
      class n {
        constructor() {
          this.matchIndexes = {};
          this.regexes = [];
          this.matchAt = 1;
          this.position = 0;
        }
        addRule(i, a) {
          a.position = this.position++;
          this.matchIndexes[this.matchAt] = a;
          this.regexes.push([a, i]);
          this.matchAt += Bxa(i) + 1;
        }
        compile() {
          if (this.regexes.length === 0) {
            this.exec = () => null;
          }
          let i = this.regexes.map(a => a[1]);
          this.matcherRe = t(Sfo(i, {
            joinWith: "|"
          }), true);
          this.lastIndex = 0;
        }
        exec(i) {
          this.matcherRe.lastIndex = this.lastIndex;
          let a = this.matcherRe.exec(i);
          if (!a) {
            return null;
          }
          let l = a.findIndex((u, d) => d > 0 && u !== undefined);
          let c = this.matchIndexes[l];
          a.splice(0, l);
          return Object.assign(a, c);
        }
      }
      class r {
        constructor() {
          this.rules = [];
          this.multiRegexes = [];
          this.count = 0;
          this.lastIndex = 0;
          this.regexIndex = 0;
        }
        getMatcher(i) {
          if (this.multiRegexes[i]) {
            return this.multiRegexes[i];
          }
          let a = new n();
          this.rules.slice(i).forEach(([l, c]) => a.addRule(l, c));
          a.compile();
          this.multiRegexes[i] = a;
          return a;
        }
        resumingScanAtSamePosition() {
          return this.regexIndex !== 0;
        }
        considerAll() {
          this.regexIndex = 0;
        }
        addRule(i, a) {
          if (this.rules.push([i, a]), a.type === "begin") {
            this.count++;
          }
        }
        exec(i) {
          let a = this.getMatcher(this.regexIndex);
          a.lastIndex = this.lastIndex;
          let l = a.exec(i);
          if (this.resumingScanAtSamePosition()) {
            if (l && l.index === this.lastIndex) {
              ;
            } else {
              let c = this.getMatcher(0);
              c.lastIndex = this.lastIndex + 1;
              l = c.exec(i);
            }
          }
          if (l) {
            if (this.regexIndex += l.position + 1, this.regexIndex === this.count) {
              this.considerAll();
            }
          }
          return l;
        }
      }
      function o(i) {
        let a = new r();
        if (i.contains.forEach(l => a.addRule(l.begin, {
          rule: l,
          type: "begin"
        })), i.terminatorEnd) {
          a.addRule(i.terminatorEnd, {
            type: "end"
          });
        }
        if (i.illegal) {
          a.addRule(i.illegal, {
            type: "illegal"
          });
        }
        return a;
      }
      function s(i, a) {
        let l = i;
        if (i.isCompiled) {
          return l;
        }
        [Kkp, Xkp, aAp, Zkp].forEach(u => u(i, a));
        e.compilerExtensions.forEach(u => u(i, a));
        i.__beforeBegin = null;
        [Ykp, Jkp, Qkp].forEach(u => u(i, a));
        i.isCompiled = true;
        let c = null;
        if (typeof i.keywords === "object" && i.keywords.$pattern) {
          i.keywords = Object.assign({}, i.keywords);
          c = i.keywords.$pattern;
          delete i.keywords.$pattern;
        }
        if (c = c || /\w+/, i.keywords) {
          i.keywords = Wxa(i.keywords, e.case_insensitive);
        }
        if (l.keywordPatternRe = t(c, true), a) {
          if (!i.begin) {
            i.begin = /\B|\b/;
          }
          if (l.beginRe = t(l.begin), !i.end && !i.endsWithParent) {
            i.end = /\B|\b/;
          }
          if (i.end) {
            l.endRe = t(l.end);
          }
          if (l.terminatorEnd = TWt(l.end) || "", i.endsWithParent && a.terminatorEnd) {
            l.terminatorEnd += (i.end ? "|" : "") + a.terminatorEnd;
          }
        }
        if (i.illegal) {
          l.illegalRe = t(i.illegal);
        }
        if (!i.contains) {
          i.contains = [];
        }
        if (i.contains = [].concat(...i.contains.map(function (u) {
          return cAp(u === "self" ? i : u);
        })), i.contains.forEach(function (u) {
          s(u, l);
        }), i.starts) {
          s(i.starts, a);
        }
        l.matcher = o(l);
        return l;
      }
      if (!e.compilerExtensions) {
        e.compilerExtensions = [];
      }
      if (e.contains && e.contains.includes("self")) {
        throw Error("ERR: contains `self` is not supported at the top-level of a language.  See documentation.");
      }
      e.classNameAliases = WDe(e.classNameAliases || {});
      return s(e);
    }
    function Vxa(e) {
      if (!e) {
        return false;
      }
      return e.endsWithParent || Vxa(e.starts);
    }
    function cAp(e) {
      if (e.variants && !e.cachedVariants) {
        e.cachedVariants = e.variants.map(function (t) {
          return WDe(e, {
            variants: null
          }, t);
        });
      }
      if (e.cachedVariants) {
        return e.cachedVariants;
      }
      if (Vxa(e)) {
        return WDe(e, {
          starts: e.starts ? WDe(e.starts) : null
        });
      }
      if (Object.isFrozen(e)) {
        return WDe(e);
      }
      return e;
    }
    class zxa extends Error {
      constructor(e, t) {
        super(e);
        this.name = "HTMLInjectionError";
        this.html = t;
      }
    }
    var gfo = Nxa;
    var Oxa = WDe;
    var Dxa = Symbol("nomatch");
    var Kxa = function (e) {
      let t = Object.create(null);
      let n = Object.create(null);
      let r = [];
      let o = true;
      let s = "Could not find the language '{}', did you forget to load/include a language module?";
      let i = {
        disableAutodetect: true,
        name: "Plain text",
        contains: []
      };
      let a = {
        ignoreUnescapedHTML: false,
        throwUnescapedHTML: false,
        noHighlightRe: /^(no-?highlight)$/i,
        languageDetectRe: /\blang(?:uage)?-([\w-]+)\b/i,
        classPrefix: "hljs-",
        cssSelector: "pre code",
        languages: null,
        __emitter: Fxa
      };
      function l(H) {
        return a.noHighlightRe.test(H);
      }
      function c(H) {
        let U = H.className + " ";
        U += H.parentNode ? H.parentNode.className : "";
        let N = a.languageDetectRe.exec(U);
        if (N) {
          let W = A(N[1]);
          if (!W) {
            Pxa(s.replace("{}", N[1]));
            Pxa("Falling back to no-highlight mode for this block.", H);
          }
          return W ? N[1] : "no-highlight";
        }
        return U.split(/\s+/).find(W => l(W) || A(W));
      }
      function u(H, U, N) {
        let W = "";
        let j = "";
        if (typeof U === "object") {
          W = H;
          N = U.ignoreIllegals;
          j = U.language;
        } else {
          Xpt("10.7.0", "highlight(lang, code, ...args) has been deprecated.");
          Xpt("10.7.0", `Please use highlight(code, options) instead.
https://github.com/highlightjs/highlight.js/issues/2277`);
          j = H;
          W = U;
        }
        if (N === undefined) {
          N = true;
        }
        let z = {
          code: W,
          language: j
        };
        P("before:highlight", z);
        let V = z.result ? z.result : d(z.language, z.code, N);
        V.code = z.code;
        P("after:highlight", V);
        return V;
      }
      function d(H, U, N, W) {
        let j = Object.create(null);
        function z(Ie, Ue) {
          return Ie.keywords[Ue];
        }
        function V() {
          if (!ue.keywords) {
            le.addText(pe);
            return;
          }
          let Ie = 0;
          ue.keywordPatternRe.lastIndex = 0;
          let Ue = ue.keywordPatternRe.exec(pe);
          let Ge = "";
          while (Ue) {
            Ge += pe.substring(Ie, Ue.index);
            let Be = fe.case_insensitive ? Ue[0].toLowerCase() : Ue[0];
            let We = z(ue, Be);
            if (We) {
              let [Ze, Tt] = We;
              if (le.addText(Ge), Ge = "", j[Be] = (j[Be] || 0) + 1, j[Be] <= 7) {
                ve += Tt;
              }
              if (Ze.startsWith("_")) {
                Ge += Ue[0];
              } else {
                let kt = fe.classNameAliases[Ze] || Ze;
                Q(Ue[0], kt);
              }
            } else {
              Ge += Ue[0];
            }
            Ie = ue.keywordPatternRe.lastIndex;
            Ue = ue.keywordPatternRe.exec(pe);
          }
          Ge += pe.substring(Ie);
          le.addText(Ge);
        }
        function K() {
          if (pe === "") {
            return;
          }
          let Ie = null;
          if (typeof ue.subLanguage === "string") {
            if (!t[ue.subLanguage]) {
              le.addText(pe);
              return;
            }
            Ie = d(ue.subLanguage, pe, true, ce[ue.subLanguage]);
            ce[ue.subLanguage] = Ie._top;
          } else {
            Ie = m(pe, ue.subLanguage.length ? ue.subLanguage : null);
          }
          if (ue.relevance > 0) {
            ve += Ie.relevance;
          }
          le.__addSublanguage(Ie._emitter, Ie.language);
        }
        function J() {
          if (ue.subLanguage != null) {
            K();
          } else {
            V();
          }
          pe = "";
        }
        function Q(Ie, Ue) {
          if (Ie === "") {
            return;
          }
          le.startScope(Ue);
          le.addText(Ie);
          le.endScope();
        }
        function Z(Ie, Ue) {
          let Ge = 1;
          let Be = Ue.length - 1;
          while (Ge <= Be) {
            if (!Ie._emit[Ge]) {
              Ge++;
              continue;
            }
            let We = fe.classNameAliases[Ie[Ge]] || Ie[Ge];
            let Ze = Ue[Ge];
            if (We) {
              Q(Ze, We);
            } else {
              pe = Ze;
              V();
              pe = "";
            }
            Ge++;
          }
        }
        function ne(Ie, Ue) {
          if (Ie.scope && typeof Ie.scope === "string") {
            le.openNode(fe.classNameAliases[Ie.scope] || Ie.scope);
          }
          if (Ie.beginScope) {
            if (Ie.beginScope._wrap) {
              Q(pe, fe.classNameAliases[Ie.beginScope._wrap] || Ie.beginScope._wrap);
              pe = "";
            } else if (Ie.beginScope._multi) {
              Z(Ie.beginScope, Ue);
              pe = "";
            }
          }
          ue = Object.create(Ie, {
            parent: {
              value: ue
            }
          });
          return ue;
        }
        function oe(Ie, Ue, Ge) {
          let Be = kkp(Ie.endRe, Ge);
          if (Be) {
            if (Ie["on:end"]) {
              let We = new yfo(Ie);
              if (Ie["on:end"](Ue, We), We.isMatchIgnored) {
                Be = false;
              }
            }
            if (Be) {
              while (Ie.endsParent && Ie.parent) {
                Ie = Ie.parent;
              }
              return Ie;
            }
          }
          if (Ie.endsWithParent) {
            return oe(Ie.parent, Ue, Ge);
          }
        }
        function ee(Ie) {
          if (ue.matcher.regexIndex === 0) {
            pe += Ie[0];
            return 1;
          } else {
            ke = true;
            return 0;
          }
        }
        function re(Ie) {
          let Ue = Ie[0];
          let Ge = Ie.rule;
          let Be = new yfo(Ge);
          let We = [Ge.__beforeBegin, Ge["on:begin"]];
          for (let Ze of We) {
            if (!Ze) {
              continue;
            }
            if (Ze(Ie, Be), Be.isMatchIgnored) {
              return ee(Ue);
            }
          }
          if (Ge.skip) {
            pe += Ue;
          } else {
            if (Ge.excludeBegin) {
              pe += Ue;
            }
            if (J(), !Ge.returnBegin && !Ge.excludeBegin) {
              pe = Ue;
            }
          }
          ne(Ge, Ie);
          return Ge.returnBegin ? 0 : Ue.length;
        }
        function se(Ie) {
          let Ue = Ie[0];
          let Ge = U.substring(Ie.index);
          let Be = oe(ue, Ie, Ge);
          if (!Be) {
            return Dxa;
          }
          let We = ue;
          if (ue.endScope && ue.endScope._wrap) {
            J();
            Q(Ue, ue.endScope._wrap);
          } else if (ue.endScope && ue.endScope._multi) {
            J();
            Z(ue.endScope, Ie);
          } else if (We.skip) {
            pe += Ue;
          } else {
            if (!(We.returnEnd || We.excludeEnd)) {
              pe += Ue;
            }
            if (J(), We.excludeEnd) {
              pe = Ue;
            }
          }
          do {
            if (ue.scope) {
              le.closeNode();
            }
            if (!ue.skip && !ue.subLanguage) {
              ve += ue.relevance;
            }
            ue = ue.parent;
          } while (ue !== Be.parent);
          if (Be.starts) {
            ne(Be.starts, Ie);
          }
          return We.returnEnd ? 0 : Ue.length;
        }
        function ae() {
          let Ie = [];
          for (let Ue = ue; Ue !== fe; Ue = Ue.parent) {
            if (Ue.scope) {
              Ie.unshift(Ue.scope);
            }
          }
          Ie.forEach(Ue => le.openNode(Ue));
        }
        let de = {};
        function be(Ie, Ue) {
          let Ge = Ue && Ue[0];
          if (pe += Ie, Ge == null) {
            J();
            return 0;
          }
          if (de.type === "begin" && Ue.type === "end" && de.index === Ue.index && Ge === "") {
            if (pe += U.slice(Ue.index, Ue.index + 1), !o) {
              let Be = Error(`0 width match regex (${H})`);
              throw Be.languageName = H, Be.badRule = de.rule, Be;
            }
            return 1;
          }
          if (de = Ue, Ue.type === "begin") {
            return re(Ue);
          } else if (Ue.type === "illegal" && !N) {
            let Be = Error('Illegal lexeme "' + Ge + '" for mode "' + (ue.scope || "<unnamed>") + '"');
            throw Be.mode = ue, Be;
          } else if (Ue.type === "end") {
            let Be = se(Ue);
            if (Be !== Dxa) {
              return Be;
            }
          }
          if (Ue.type === "illegal" && Ge === "") {
            pe += `
`;
            return 1;
          }
          if (xe > 1e5 && xe > Ue.index * 3) {
            throw Error("potential infinite loop, way more iterations than matches");
          }
          pe += Ge;
          return Ge.length;
        }
        let fe = A(H);
        if (!fe) {
          throw d5e(s.replace("{}", H)), Error('Unknown language: "' + H + '"');
        }
        let me = lAp(fe);
        let Te = "";
        let ue = W || me;
        let ce = {};
        let le = new a.__emitter(a);
        ae();
        let pe = "";
        let ve = 0;
        let _e = 0;
        let xe = 0;
        let ke = false;
        try {
          if (!fe.__emitTokens) {
            ue.matcher.considerAll();
            for (;;) {
              if (xe++, ke) {
                ke = false;
              } else {
                ue.matcher.considerAll();
              }
              ue.matcher.lastIndex = _e;
              let Ie = ue.matcher.exec(U);
              if (!Ie) {
                break;
              }
              let Ue = U.substring(_e, Ie.index);
              let Ge = be(Ue, Ie);
              _e = Ie.index + Ge;
            }
            be(U.substring(_e));
          } else {
            fe.__emitTokens(U, le);
          }
          le.finalize();
          Te = le.toHTML();
          return {
            language: H,
            value: Te,
            relevance: ve,
            illegal: false,
            _emitter: le,
            _top: ue
          };
        } catch (Ie) {
          if (Ie.message && Ie.message.includes("Illegal")) {
            return {
              language: H,
              value: gfo(U),
              illegal: true,
              relevance: 0,
              _illegalBy: {
                message: Ie.message,
                index: _e,
                context: U.slice(_e - 100, _e + 100),
                mode: Ie.mode,
                resultSoFar: Te
              },
              _emitter: le
            };
          } else if (o) {
            return {
              language: H,
              value: gfo(U),
              illegal: false,
              relevance: 0,
              errorRaised: Ie,
              _emitter: le,
              _top: ue
            };
          } else {
            throw Ie;
          }
        }
      }
      function p(H) {
        let U = {
          value: gfo(H),
          illegal: false,
          relevance: 0,
          _top: i,
          _emitter: new a.__emitter(a)
        };
        U._emitter.addText(H);
        return U;
      }
      function m(H, U) {
        U = U || a.languages || Object.keys(t);
        let N = p(H);
        let W = U.filter(A).filter(I).map(J => d(J, H, false));
        W.unshift(N);
        let j = W.sort((J, Q) => {
          if (J.relevance !== Q.relevance) {
            return Q.relevance - J.relevance;
          }
          if (J.language && Q.language) {
            if (A(J.language).supersetOf === Q.language) {
              return 1;
            } else if (A(Q.language).supersetOf === J.language) {
              return -1;
            }
          }
          return 0;
        });
        let [z, V] = j;
        let K = z;
        K.secondBest = V;
        return K;
      }
      function f(H, U, N) {
        let W = U && n[U] || N;
        H.classList.add("hljs");
        H.classList.add(`language-${W}`);
      }
      function h(H) {
        let U = null;
        let N = c(H);
        if (l(N)) {
          return;
        }
        if (P("before:highlightElement", {
          el: H,
          language: N
        }), H.dataset.highlighted) {
          console.log("Element previously highlighted. To highlight again, first unset `dataset.highlighted`.", H);
          return;
        }
        if (H.children.length > 0) {
          if (!a.ignoreUnescapedHTML) {
            console.warn("One of your code blocks includes unescaped HTML. This is a potentially serious security risk.");
            console.warn("https://github.com/highlightjs/highlight.js/wiki/security");
            console.warn("The element with unescaped HTML:");
            console.warn(H);
          }
          if (a.throwUnescapedHTML) {
            throw new zxa("One of your code blocks includes unescaped HTML.", H.innerHTML);
          }
        }
        U = H;
        let W = U.textContent;
        let j = N ? u(W, {
          language: N,
          ignoreIllegals: true
        }) : m(W);
        if (H.innerHTML = j.value, H.dataset.highlighted = "yes", f(H, N, j.language), H.result = {
          language: j.language,
          re: j.relevance,
          relevance: j.relevance
        }, j.secondBest) {
          H.secondBest = {
            language: j.secondBest.language,
            relevance: j.secondBest.relevance
          };
        }
        P("after:highlightElement", {
          el: H,
          result: j,
          text: W
        });
      }
      function g(H) {
        a = Oxa(a, H);
      }
      let y = () => {
        S();
        Xpt("10.6.0", "initHighlighting() deprecated.  Use highlightAll() now.");
      };
      function _() {
        S();
        Xpt("10.6.0", "initHighlightingOnLoad() deprecated.  Use highlightAll() now.");
      }
      let b = false;
      function S() {
        function H() {
          S();
        }
        if (document.readyState === "loading") {
          if (!b) {
            window.addEventListener("DOMContentLoaded", H, false);
          }
          b = true;
          return;
        }
        document.querySelectorAll(a.cssSelector).forEach(h);
      }
      function E(H, U) {
        let N = null;
        try {
          N = U(e);
        } catch (W) {
          if (d5e("Language definition for '{}' could not be registered.".replace("{}", H)), !o) {
            throw W;
          } else {
            d5e(W);
          }
          N = i;
        }
        if (!N.name) {
          N.name = H;
        }
        if (t[H] = N, N.rawDefinition = U.bind(null, e), N.aliases) {
          k(N.aliases, {
            languageName: H
          });
        }
      }
      function C(H) {
        delete t[H];
        for (let U of Object.keys(n)) {
          if (n[U] === H) {
            delete n[U];
          }
        }
      }
      function x() {
        return Object.keys(t);
      }
      function A(H) {
        H = (H || "").toLowerCase();
        return t[H] || t[n[H]];
      }
      function k(H, {
        languageName: U
      }) {
        if (typeof H === "string") {
          H = [H];
        }
        H.forEach(N => {
          n[N.toLowerCase()] = U;
        });
      }
      function I(H) {
        let U = A(H);
        return U && !U.disableAutodetect;
      }
      function O(H) {
        if (H["before:highlightBlock"] && !H["before:highlightElement"]) {
          H["before:highlightElement"] = U => {
            H["before:highlightBlock"](Object.assign({
              block: U.el
            }, U));
          };
        }
        if (H["after:highlightBlock"] && !H["after:highlightElement"]) {
          H["after:highlightElement"] = U => {
            H["after:highlightBlock"](Object.assign({
              block: U.el
            }, U));
          };
        }
      }
      function M(H) {
        O(H);
        r.push(H);
      }
      function L(H) {
        let U = r.indexOf(H);
        if (U !== -1) {
          r.splice(U, 1);
        }
      }
      function P(H, U) {
        let N = H;
        r.forEach(function (W) {
          if (W[N]) {
            W[N](U);
          }
        });
      }
      function F(H) {
        Xpt("10.7.0", "highlightBlock will be removed entirely in v12.0");
        Xpt("10.7.0", "Please use highlightElement now.");
        return h(H);
      }
      Object.assign(e, {
        highlight: u,
        highlightAuto: m,
        highlightAll: S,
        highlightElement: h,
        highlightBlock: F,
        configure: g,
        initHighlighting: y,
        initHighlightingOnLoad: _,
        registerLanguage: E,
        unregisterLanguage: C,
        listLanguages: x,
        getLanguage: A,
        registerAliases: k,
        autoDetection: I,
        inherit: Oxa,
        addPlugin: M,
        removePlugin: L
      });