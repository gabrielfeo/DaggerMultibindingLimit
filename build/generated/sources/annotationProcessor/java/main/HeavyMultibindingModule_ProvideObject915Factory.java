import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject915Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject915Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject915(module);
  }

  public static HeavyMultibindingModule_ProvideObject915Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject915Factory(module);
  }

  public static Object provideObject915(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject915());
  }
}
