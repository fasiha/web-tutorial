# Lightweight ClojureScript, React.js, Figwheel skeleton

This repository is based on Bruce Hauman's Figwheel quick-start project [[GitHub](https://github.com/bhauman/lein-figwheel/wiki/Quick-Start)], but updated to use a recent Sablono and React and ReactDOM.

# Build instructions

## Development mode with Figwheel and auto-code-reload

```
$ lein clean
$ lein figwheel dev
```

Then open [localhost:5309](http://localhost:5309).

## Deploy mode with advanced Google Closure compilation

```
$ lein clean
$ lein cljsbuild once min
```

Compiled assets placed in `resources/public`.

# Notes

## Rename
To rename the project from `sente-tutorial` to whatever else, find and replace all references to `sente-tutorial` with the new name in cljs and clj files (including `project.clj`), then rename the `src/sente_tutorial` directory appropriately (remember, dashes in Clojure namespaces must be replaced by underscores `_`).