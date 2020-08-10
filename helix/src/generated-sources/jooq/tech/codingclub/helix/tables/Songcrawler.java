/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Songcrawler extends org.jooq.impl.TableImpl<tech.codingclub.helix.tables.records.SongcrawlerRecord> {

	private static final long serialVersionUID = 934868583;

	/**
	 * The singleton instance of <code>public.songcrawler</code>
	 */
	public static final tech.codingclub.helix.tables.Songcrawler SONGCRAWLER = new tech.codingclub.helix.tables.Songcrawler();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<tech.codingclub.helix.tables.records.SongcrawlerRecord> getRecordType() {
		return tech.codingclub.helix.tables.records.SongcrawlerRecord.class;
	}

	/**
	 * The column <code>public.songcrawler.parent_link</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> PARENT_LINK = createField("parent_link", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.link</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> LINK = createField("link", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.album</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> ALBUM = createField("album", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.duration</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> DURATION = createField("duration", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.singers</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> SINGERS = createField("singers", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.lyricist</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> LYRICIST = createField("lyricist", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.music_director</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> MUSIC_DIRECTOR = createField("music_director", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.download_128</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> DOWNLOAD_128 = createField("download_128", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.download_256</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> DOWNLOAD_256 = createField("download_256", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songcrawler.image_url</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.SongcrawlerRecord, java.lang.String> IMAGE_URL = createField("image_url", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>public.songcrawler</code> table reference
	 */
	public Songcrawler() {
		this("songcrawler", null);
	}

	/**
	 * Create an aliased <code>public.songcrawler</code> table reference
	 */
	public Songcrawler(java.lang.String alias) {
		this(alias, tech.codingclub.helix.tables.Songcrawler.SONGCRAWLER);
	}

	private Songcrawler(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.SongcrawlerRecord> aliased) {
		this(alias, aliased, null);
	}

	private Songcrawler(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.SongcrawlerRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, tech.codingclub.helix.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public tech.codingclub.helix.tables.Songcrawler as(java.lang.String alias) {
		return new tech.codingclub.helix.tables.Songcrawler(alias, this);
	}

	/**
	 * Rename this table
	 */
	public tech.codingclub.helix.tables.Songcrawler rename(java.lang.String name) {
		return new tech.codingclub.helix.tables.Songcrawler(name, null);
	}
}